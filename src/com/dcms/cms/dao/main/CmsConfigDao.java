package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.CmsConfig;
import com.dcms.common.hibernate3.Updater;

public interface CmsConfigDao {
	public CmsConfig findById(Integer id);

	public CmsConfig updateByUpdater(Updater<CmsConfig> updater);
}