package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.CmsUser;
import com.dcms.cms.entity.main.CmsUserExt;

public interface CmsUserExtMng {
	public CmsUserExt save(CmsUserExt ext, CmsUser user);

	public CmsUserExt update(CmsUserExt ext, CmsUser user);
}