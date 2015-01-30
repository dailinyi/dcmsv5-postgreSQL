package com.dcms.cms.dao.main;

import java.util.List;

import com.dcms.cms.entity.main.CmsRole;
import com.dcms.common.hibernate3.Updater;

public interface CmsRoleDao {
	public List<CmsRole> getList();

	public CmsRole findById(Integer id);

	public CmsRole save(CmsRole bean);

	public CmsRole updateByUpdater(Updater<CmsRole> updater);

	public CmsRole deleteById(Integer id);
}