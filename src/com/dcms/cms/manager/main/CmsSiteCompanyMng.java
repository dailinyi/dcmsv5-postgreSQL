package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.CmsSite;
import com.dcms.cms.entity.main.CmsSiteCompany;

public interface CmsSiteCompanyMng {
	public CmsSiteCompany save(CmsSite site,CmsSiteCompany bean);

	public CmsSiteCompany update(CmsSiteCompany bean);
}