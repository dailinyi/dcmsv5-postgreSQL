package com.dcms.cms.manager.assist.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.*;
import org.springframework.transaction.annotation.Transactional;

import com.dcms.cms.dao.assist.CmsRegionDao;
import com.dcms.cms.entity.assist.CmsRegion;
import com.dcms.cms.manager.assist.CmsRegionMng;

@Service
@Transactional
public class CmsRegionMngImpl implements CmsRegionMng {

	public List<CmsRegion> getList(CmsRegion.RegionLevel level) {
		return dao.getListByLevel(level);
	}

	public List<CmsRegion> getContinent() {
		return dao.getListByLevel(CmsRegion.RegionLevel.CONTINENT);
	}

	public List<CmsRegion> getProvince() {
		return dao.getListByLevel(CmsRegion.RegionLevel.PROVINCE);
	}

	public List<CmsRegion> getAll() {
		return dao.getAll();
	}

	@Override
	public List<CmsRegion> getRegionsByParentId(Integer parentId) {
		return dao.findByProperty(CmsRegion.PARENT_REGION, parentId);
	}

	public Set<CmsRegion> getAllRegionsByParentId(Integer parentId) {
		CmsRegion region = findById(parentId);
		Set<CmsRegion> regions = new HashSet<CmsRegion>(region.getAllRegions());
		return regions;
	}

	public List<CmsRegion> getListByName(String[] str) {
		return dao.getListByName(str);
	}

	public CmsRegion findById(Integer id) {
		return dao.findById(id);
	}

	public CmsRegion findByCode(String code) {
		return dao.findByCode(code);
	}


	@Override
	public Integer[] getRegionIdsByQueryRegionId(Integer[] queryRegionId) {
		if (queryRegionId == null || queryRegionId.length == 0 || queryRegionId[0]==null) {
			return null;
		}
		Set<CmsRegion> regions = new HashSet<CmsRegion>();
		int length = queryRegionId.length;
		while (length > 0) {
			if (queryRegionId[length - 1] != null) {
				regions = getAllRegionsByParentId(queryRegionId[length - 1]);
				break;
			}
			length--;
		}
		Integer[] regionIds = new Integer[regions.size()];
		int i = 0;
		for (Iterator<CmsRegion> it = regions.iterator(); it.hasNext();) {
			regionIds[i] = it.next().getId();
			i++;
		}
		return regionIds;
	}


	private CmsRegionDao dao;

	@Autowired
	public void setDao(CmsRegionDao dao) {
		this.dao = dao;
	}

}
