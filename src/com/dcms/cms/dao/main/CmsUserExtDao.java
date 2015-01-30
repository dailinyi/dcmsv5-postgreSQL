package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.CmsUserExt;
import com.dcms.common.hibernate3.Updater;

public interface CmsUserExtDao {
	public CmsUserExt findById(Integer id);

	public CmsUserExt save(CmsUserExt bean);

	public CmsUserExt updateByUpdater(Updater<CmsUserExt> updater);
}