package com.x.query.assemble.designer.jaxrs.table;

import java.util.List;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.project.Application;
import com.x.base.core.project.x_query_assemble_designer;
import com.x.base.core.project.connection.CipherConnectionAction;
import com.x.base.core.project.exception.ExceptionAccessDenied;
import com.x.base.core.project.exception.ExceptionEntityNotExist;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.jaxrs.WrapBoolean;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.base.core.project.tools.ListTools;
import com.x.query.assemble.designer.Business;
import com.x.query.assemble.designer.ThisApplication;
import com.x.query.core.entity.Query;

class ActionBuildTableDispatch extends BaseAction {

	private static final Logger LOGGER = LoggerFactory.getLogger(ActionBuildTableDispatch.class);

	ActionResult<Wo> execute(EffectivePerson effectivePerson, String queryId) throws Exception {
		LOGGER.debug("execute:{}.", effectivePerson::getDistinguishedName);
		ActionResult<Wo> result = new ActionResult<>();
		Wo wo = new Wo();
		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
			Business business = new Business(emc);
			if (!business.controllable(effectivePerson)) {
				throw new ExceptionAccessDenied(effectivePerson);
			}
			Query query = emc.fetch(queryId, Query.class);
			if (null == query) {
				throw new ExceptionEntityNotExist(queryId, Query.class);
			}
		}
		List<Application> apps = ThisApplication.context().applications().get(x_query_assemble_designer.class);
		if (ListTools.isNotEmpty(apps)) {
			apps.stream().forEach(o -> {
				String url = o.getUrlJaxrsRoot() + "table/" + queryId + "/build?tt=" + System.currentTimeMillis();
				LOGGER.info("{} do dispatch build query {} table request to : {}.",
						effectivePerson.getDistinguishedName(), queryId, url);
				try {
					CipherConnectionAction.get(effectivePerson.getDebugger(), url);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
		wo.setValue(true);

		result.setData(wo);

		return result;
	}

	public static class Wo extends WrapBoolean {

		private static final long serialVersionUID = -7885741023719404711L;

	}

}
