package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.ContentExt;
import com.dcms.common.hibernate3.Updater;

public interface ContentExtDao {
	public ContentExt findById(Integer id);

	public ContentExt save(ContentExt bean);

	public ContentExt updateByUpdater(Updater<ContentExt> updater);
}