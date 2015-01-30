package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.CmsUser;
import com.dcms.cms.entity.main.CmsUserResume;

public interface CmsUserResumeMng {
	public CmsUserResume save(CmsUserResume ext, CmsUser user);

	public CmsUserResume update(CmsUserResume ext, CmsUser user);
}