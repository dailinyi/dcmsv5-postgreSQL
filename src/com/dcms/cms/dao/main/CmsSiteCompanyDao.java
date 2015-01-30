package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.CmsSiteCompany;
import com.dcms.common.hibernate3.Updater;

public interface CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean);

	public CmsSiteCompany updateByUpdater(Updater<CmsSiteCompany> updater);
}