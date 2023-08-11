package com.x.processplatform.service.processing.jaxrs.data;

import com.google.gson.JsonElement;
import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.project.exception.ExceptionEntityNotExist;
import com.x.base.core.project.executor.ProcessPlatformExecutorFactory;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.jaxrs.WoId;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.base.core.project.tools.ListTools;
import com.x.processplatform.core.entity.content.Work;
import com.x.processplatform.core.express.service.processing.jaxrs.data.DataWi;
import com.x.processplatform.service.processing.Business;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class ActionUpdateWithWorkPath extends BaseAction {

	private static final Logger LOGGER = LoggerFactory.getLogger(ActionUpdateWithWorkPath.class);

	ActionResult<Wo> execute(EffectivePerson effectivePerson, String id, String path, JsonElement jsonElement)
			throws Exception {

		LOGGER.debug("execute:{}, id:{}, path:{}.", effectivePerson::getDistinguishedName, () -> id, () -> path);

		ActionResult<Wo> result = new ActionResult<>();
		Wo wo = new Wo();
		String executorSeed = null;
		Wi wi = this.convertToWrapIn(jsonElement, Wi.class);

		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
			Work work = emc.fetch(id, Work.class, ListTools.toList(Work.job_FIELDNAME));
			if (null == work) {
				throw new ExceptionEntityNotExist(id, Work.class);
			}
			executorSeed = work.getJob();
		}

		Callable<String> callable = () -> {
			try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
				Business business = new Business(emc);
				Work work = emc.find(id, Work.class);
				if (null == work) {
					throw new ExceptionEntityNotExist(id, Work.class);
				}
				String[] paths = path.split(PATH_SPLIT);
				updateData(business, work, wi.getJsonElement(), paths);
				/* updateTitleSerial 和 updateData 方法内进行了提交 */

				wi.init(work);
				wi.setJsonElement(getDataWithPath(business, wi.getJob(), paths[0]));
				createDataRecord(business, wi);

				wo.setId(work.getId());
			}
			return "";
		};

		ProcessPlatformExecutorFactory.get(executorSeed).submit(callable).get(300, TimeUnit.SECONDS);

		result.setData(wo);
		return result;
	}

	public static class Wi extends DataWi {

		private static final long serialVersionUID = -9058148245581077383L;
	}

	public static class Wo extends WoId {

		private static final long serialVersionUID = -2274823188689339473L;

	}

}