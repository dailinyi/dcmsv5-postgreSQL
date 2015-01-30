package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.Content;
import com.dcms.cms.entity.main.ContentExt;

public interface ContentExtMng {
	public ContentExt save(ContentExt ext, Content content);

	public ContentExt update(ContentExt ext);
}