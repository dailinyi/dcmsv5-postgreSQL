package com.dcms.cms.dao.main;

import java.util.Date;

import com.dcms.cms.entity.main.CmsLog;
import com.dcms.common.page.Pagination;

public interface CmsLogDao {
	public Pagination getPage(Integer category, Integer siteId, Integer userId,
			String title, String ip, int pageNo, int pageSize);

	public CmsLog findById(Integer id);

	public CmsLog save(CmsLog bean);

	public CmsLog deleteById(Integer id);

	public int deleteBatch(Integer category, Integer siteId, Date before);
}