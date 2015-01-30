package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.ContentTxt;
import com.dcms.common.hibernate3.Updater;

public interface ContentTxtDao {
	public ContentTxt findById(Integer id);

	public ContentTxt save(ContentTxt bean);

	public ContentTxt updateByUpdater(Updater<ContentTxt> updater);
}