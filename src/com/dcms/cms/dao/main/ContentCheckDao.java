package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.ContentCheck;
import com.dcms.common.hibernate3.Updater;

public interface ContentCheckDao {
	public ContentCheck findById(Long id);

	public ContentCheck save(ContentCheck bean);

	public ContentCheck updateByUpdater(Updater<ContentCheck> updater);
}