package com.x.processplatform.service.processing.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.project.Applications;
import com.x.base.core.project.x_processplatform_service_processing;
import com.x.base.core.project.jaxrs.WoId;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.base.core.project.schedule.AbstractJob;
import com.x.base.core.project.utils.time.TimeStamp;
import com.x.processplatform.core.entity.content.Work;
import com.x.processplatform.core.entity.content.Work_;
import com.x.processplatform.core.entity.element.ActivityType;
import com.x.processplatform.service.processing.ProcessingAttributes;
import com.x.processplatform.service.processing.ThisApplication;

import fr.opensagres.poi.xwpf.converter.core.utils.StringUtils;

public class TouchDelay extends AbstractJob {

	private static Logger logger = LoggerFactory.getLogger(TouchDelay.class);

	@Override
	public void schedule(JobExecutionContext jobExecutionContext) throws Exception {
		try {
			TimeStamp stamp = new TimeStamp();
			List<Work> targets = new ArrayList<>();
			String sequence = null;
			AtomicInteger count = new AtomicInteger();
			do {
				try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
					targets = this.list(emc, sequence);
				}
				if (!targets.isEmpty()) {
					sequence = targets.get(targets.size() - 1).getSequence();
					for (Work work : targets) {
						try {
							try {
								ThisApplication.context().applications()
										.putQuery(x_processplatform_service_processing.class,
												Applications.joinQueryUri("work", work.getId(), "processing"),
												new ProcessingAttributes(), work.getJob())
										.getData(WoId.class);
								count.incrementAndGet();
							} catch (Exception e) {
								throw new ExceptionTouchDelay(e, work.getId(), work.getTitle(), work.getSequence());
							}
						} catch (Exception e) {
							logger.error(e);
						}
					}
				}
			} while (!targets.isEmpty());
			logger.print("完成触发{}个延时工作, 耗时:{}.", count.intValue(), stamp.consumingMilliseconds());
		} catch (Exception e) {
			throw new JobExecutionException(e);
		}
	}

	private List<Work> list(EntityManagerContainer emc, String sequence) throws Exception {
		EntityManager em = emc.get(Work.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class);
		Root<Work> root = cq.from(Work.class);
		Path<String> id_path = root.get(Work_.id);
		Path<String> job_path = root.get(Work_.job);
		Path<String> sequence_path = root.get(Work_.sequence);
		Predicate p = cb.equal(root.get(Work_.activityType), ActivityType.delay);
		if (StringUtils.isNotEmpty(sequence)) {
			p = cb.and(p, cb.greaterThan(sequence_path, sequence));
		}
		cq.multiselect(id_path, job_path, sequence_path).where(p).orderBy(cb.asc(sequence_path));
		List<Tuple> os = em.createQuery(cq).setMaxResults(200).getResultList();
		List<Work> list = new ArrayList<>();
		for (Tuple o : os) {
			Work work = new Work();
			work.setId(o.get(id_path));
			work.setJob(o.get(job_path));
			work.setSequence(o.get(sequence_path));
			list.add(work);
		}
		return list;
	}
}