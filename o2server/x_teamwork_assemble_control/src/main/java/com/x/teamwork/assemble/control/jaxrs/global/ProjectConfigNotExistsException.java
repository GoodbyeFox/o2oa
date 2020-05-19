package com.x.teamwork.assemble.control.jaxrs.global;

import com.x.base.core.project.exception.PromptException;

class ProjectConfigNotExistsException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ProjectConfigNotExistsException( String id ) {
		super("指定ID的项目配置信息不存在。ID:" + id );
	}
}
