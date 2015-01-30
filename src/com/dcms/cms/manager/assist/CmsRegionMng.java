package com.dcms.cms.manager.assist;

import java.util.List;
import java.util.Set;

import com.dcms.cms.entity.assist.CmsRegion;
import com.dcms.cms.entity.main.CmsUser;

public interface CmsRegionMng {

	public abstract List<CmsRegion> getList(CmsRegion.RegionLevel level);

	public abstract List<CmsRegion> getContinent();

	public abstract List<CmsRegion> getProvince();

	public abstract CmsRegion findById(Integer id);

	public List<CmsRegion> getListByName(String[] str);

	public List<CmsRegion> getAll();

	public CmsRegion findByCode(String code);


	/**
	 * 通过parentId找到对应的下级信息
	 * 
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public abstract List<CmsRegion> getRegionsByParentId(Integer parentId);

	/**
	 * 根据排序传过来的regionId数组获取所有可用region
	 * 
	 * @param queryRegionId
	 * @return
	 */
	public abstract Integer[] getRegionIdsByQueryRegionId(
			Integer[] queryRegionId);
	

}