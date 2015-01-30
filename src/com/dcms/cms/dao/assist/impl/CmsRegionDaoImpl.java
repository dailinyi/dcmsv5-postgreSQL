package com.dcms.cms.dao.assist.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.dcms.cms.dao.assist.CmsRegionDao;
import com.dcms.cms.entity.assist.CmsRegion;
import com.dcms.common.hibernate3.Finder;
import com.dcms.common.hibernate3.HibernateBaseDao;

@Repository
public class CmsRegionDaoImpl extends HibernateBaseDao<CmsRegion, Integer> implements CmsRegionDao {
	
	@SuppressWarnings("unchecked")
	public List<CmsRegion> getListByLevel(CmsRegion.RegionLevel level) {
		this.log.debug("find  CmsRegion instances");
		try {
			String queryString = "from CmsRegion bean where bean.level = "+ level.getValue()+" and bean.parent.id = 165 order by  bean.code ";
			Query queryObject = this.getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException e) {
			this.log.error("find all CmsRegion instances failed", e);
			throw e;
		}
	}
	public List<CmsRegion> findByProperty(String propertyName, Object value) {
	      log.debug("finding CmsRegion instance with property: " + propertyName
	            + ", value: " + value);
	      try {
	         String queryString = "from CmsRegion as model  where model." 
	         						+ propertyName + "= ?  order by model.name" ;
	         Query queryObject = getSession().createQuery(queryString);
			 queryObject.setParameter(0, value);
			 return queryObject.list();
	      } catch (RuntimeException re) {
	         log.error("find by property name failed", re);
	         throw re;
	      }
		}
	
	@SuppressWarnings("unchecked")
	public List<CmsRegion> getAll() {
		this.log.debug("find  CmsRegion instances ");
		try {
			String queryString = "from CmsRegion bean where 1=1 order by bean.code";
			Query queryObject = this.getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException e) {
			this.log.error("find all CmsRegion instances failed", e);
			throw e;
		}
	}
	
	public List<CmsRegion> getListByName(String[] str) {
		Finder find = Finder.create("from CmsRegion bean where bean.name in (:names) order by bean.code");
		find.setParamList("names", str);
		return find(find);
	}
	
	public CmsRegion findById(Integer id){
		return this.get(id);
	}
	
	public CmsRegion findByCode(String code){
		String queryString = " from CmsRegion bean  where bean.code = '"+code+"' order by bean.code";
		Query queryObject = this.getSession().createQuery(queryString);
		List<CmsRegion>  queryList = queryObject.list();
		try {
			return queryList.get(0);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	protected Class<CmsRegion> getEntityClass() {
		return CmsRegion.class;
	}
	
}
