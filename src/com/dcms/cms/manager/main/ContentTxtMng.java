package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.Content;
import com.dcms.cms.entity.main.ContentTxt;

public interface ContentTxtMng {
	public ContentTxt save(ContentTxt txt, Content content);

	public ContentTxt update(ContentTxt txt, Content content);
}