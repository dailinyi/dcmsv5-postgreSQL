package com.dcms.cms.entity.assist;

import java.util.HashSet;
import java.util.Set;

import com.dcms.cms.entity.assist.base.BaseCmsRegion;

public class CmsRegion extends BaseCmsRegion{
	
	public static final String PARENT_REGION = "parent.id";
	//public static final String REGION_LEVEL = "level";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 获取市政等级
	 * @author Daily
	 *
	 */
	public enum RegionLevel{
		
		/**
		 *  洲
		 */
		CONTINENT(0),
		/**
		 * 国家
		 */
		NATION(1),
		/**
		 * 省
		 */
		PROVINCE(2),
		/**
		 * 市
		 */
		CITY(3),
		/**
		 * 区(县)
		 */
		COUNTY(4);
		
		
		private Integer value;

		public Integer getValue() {
			return value;
		}

		RegionLevel(Integer value) {
			this.value = value;
		}
		
	}
	
	
	/**
	 * 根据传进来的region,获取所有下级地区(省级及其以下可以获取)
	 * @param region
	 * @return
	 */
	public Set<CmsRegion> getAllRegions(){
		Set<CmsRegion> regionSet = new HashSet<CmsRegion>();
		switch (getLevel()) {
		//如果是省级
		case 2:
			Set<CmsRegion> childRegion = getChild();
			regionSet.addAll(childRegion);
			for(CmsRegion r : childRegion){
				regionSet.addAll(r.getChild());
			}
			break;
		//如果是市级
		case 3:
			regionSet.addAll(getChild());
			break;
		//否则只返回当前region
		default:
			break;
		}
		//最后添加本身region
		regionSet.add(this);
		
		
		return regionSet;
	}
	
	

	public CmsRegion() {
		super();
	}

	public CmsRegion(Integer id, String name, String detailName, String code,
			String parentCode, Integer level, CmsRegion parent) {
		super(id, name, detailName, code, parentCode, level, parent);
	}

	public CmsRegion(Integer id) {
		super(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
