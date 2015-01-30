package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.CmsUserResume;
import com.dcms.common.hibernate3.Updater;

public interface CmsUserResumeDao {
	public CmsUserResume findById(Integer id);

	public CmsUserResume save(CmsUserResume bean);

	public CmsUserResume updateByUpdater(Updater<CmsUserResume> updater);
}