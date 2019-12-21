package com.x.build.redeploy;

import org.junit.Test;

import com.x.base.core.project.x_attendance_assemble_control;
import com.x.base.core.project.x_base_core_project;
import com.x.base.core.project.x_bbs_assemble_control;
import com.x.base.core.project.x_bbs_core_entity;
import com.x.base.core.project.x_calendar_assemble_control;
import com.x.base.core.project.x_calendar_core_entity;
import com.x.base.core.project.x_cms_assemble_control;
import com.x.base.core.project.x_cms_core_entity;
import com.x.base.core.project.x_component_assemble_control;
import com.x.base.core.project.x_file_assemble_control;
import com.x.base.core.project.x_file_core_entity;
import com.x.base.core.project.x_hotpic_assemble_control;
import com.x.base.core.project.x_meeting_assemble_control;
import com.x.base.core.project.x_message_assemble_communicate;
import com.x.base.core.project.x_mind_assemble_control;
import com.x.base.core.project.x_mind_core_entity;
import com.x.base.core.project.x_okr_assemble_control;
import com.x.base.core.project.x_okr_core_entity;
import com.x.base.core.project.x_organization_assemble_authentication;
import com.x.base.core.project.x_organization_assemble_control;
import com.x.base.core.project.x_organization_assemble_express;
import com.x.base.core.project.x_organization_core_entity;
import com.x.base.core.project.x_portal_assemble_surface;
import com.x.base.core.project.x_processplatform_assemble_designer;
import com.x.base.core.project.x_processplatform_assemble_surface;
import com.x.base.core.project.x_processplatform_service_processing;
import com.x.base.core.project.x_query_assemble_designer;
import com.x.base.core.project.x_query_assemble_surface;
import com.x.base.core.project.x_query_core_express;
import com.x.base.core.project.x_query_service_processing;
import com.x.base.core.project.x_teamwork_assemble_control;
import com.x.base.core.project.x_teamwork_core_entity;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;

public class Redeploy_dev_o2oa_net {

	private static Logger logger = LoggerFactory.getLogger(Redeploy_dev_o2oa_net.class);

	public static final String HOST = "dev.o2oa.net";

	public static Integer PORT = 20010;

	@Test
	public void x_hotpic_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_hotpic_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_file_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_file_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_file_core_entity() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_file_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_cms_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_cms_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_cms_core_entity() {
		logger.print("result:{}.", Redeploy.redeploy(HOST, PORT, x_cms_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_component_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_component_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_attendance_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_attendance_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_base_core_project() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_base_core_project.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_message_assemble_communicate() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_message_assemble_communicate.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_mind_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_mind_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_bbs_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_bbs_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_bbs_core_entity() {
		logger.print("result:{}.", Redeploy.redeploy(HOST, PORT, x_bbs_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_calendar_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_calendar_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_calendar_core_entity() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_calendar_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_okr_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_okr_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_okr_core_entity() {
		logger.print("result:{}.", Redeploy.redeploy(HOST, PORT, x_okr_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_mind_core_entity() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_mind_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_query_assemble_surface() {
		logger.print("result: {}.",
				Redeploy.redeploy(HOST, PORT, x_query_assemble_surface.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_query_assemble_designer() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_query_assemble_designer.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_query_service_processing() {
		logger.print("result: {}.",
				Redeploy.redeploy(HOST, PORT, x_query_service_processing.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}
	
	@Test
	public void x_query_core_express() {
		logger.print("result: {}.",
				Redeploy.redeploy(HOST, PORT, x_query_core_express.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_processplatform_assemble_surface() {
		logger.print("result: {}.",
				Redeploy.redeploy(HOST, PORT, x_processplatform_assemble_surface.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_processplatform_assemble_designer() {
		logger.print("result: {}.",
				Redeploy.redeploy(HOST, PORT, x_processplatform_assemble_designer.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_processplatform_service_processing() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_processplatform_service_processing.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_meeting_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_meeting_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_organization_assemble_express() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_organization_assemble_express.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_organization_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_organization_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_organization_assemble_authentication() {
		logger.print("result:{}.", Redeploy.redeploy(HOST, PORT, x_organization_assemble_authentication.class,
				Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_portal_assemble_surface() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_portal_assemble_surface.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_teamwork_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_teamwork_assemble_control.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_teamwork_core_entity() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_teamwork_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_organization_core_entity() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, x_organization_core_entity.class, Redeploy.DEFAULT_PUBLIC_KEY));
	}

	@Test
	public void x_wcrm_assemble_control() {
		logger.print("result:{}.",
				Redeploy.redeploy(HOST, PORT, "x_wcrm_assemble_control", Redeploy.DEFAULT_PUBLIC_KEY));
	}

}
