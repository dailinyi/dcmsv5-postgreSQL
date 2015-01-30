package com.dcms.cms.dao.main.impl;

import org.springframework.stereotype.Repository;

import com.dcms.cms.dao.main.CmsSiteCompanyDao;
import com.dcms.cms.entity.main.CmsSiteCompany;
import com.dcms.common.hibernate3.HibernateBaseDao;

@Repository
public class CmsSiteCompanyDaoImpl extends
		HibernateBaseDao<CmsSiteCompany, Integer> implements CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<CmsSiteCompany> getEntityClass() {
		return CmsSiteCompany.class;
	}
}