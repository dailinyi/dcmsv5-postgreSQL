package com.dcms.cms.dao.assist;

import java.util.List;

import com.dcms.cms.entity.assist.CmsRegion;

public interface CmsRegionDao {

	public abstract List<CmsRegion> getListByLevel(CmsRegion.RegionLevel level);
	
	public List<CmsRegion> getAll();

	public abstract CmsRegion findById(Integer id);

	
	public CmsRegion findByCode(String code);

	/**
	 * 根据实体的属性值 查询到对应的数据
	 * @param propertyName 实体的属性
	 * @param value   属性值
	 * @return
	 */
	public abstract List<CmsRegion> findByProperty(String propertyName,Object value);
	/**
	 * 根据地区名称获取数据
	 * @param str
	 * @return
	 */
	public abstract List<CmsRegion> getListByName(String[] str);
	
	


}