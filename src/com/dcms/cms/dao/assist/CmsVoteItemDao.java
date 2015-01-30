package com.dcms.cms.dao.assist;

import com.dcms.cms.entity.assist.CmsVoteItem;
import com.dcms.common.hibernate3.Updater;
import com.dcms.common.page.Pagination;

public interface CmsVoteItemDao {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsVoteItem findById(Integer id);

	public CmsVoteItem save(CmsVoteItem bean);

	public CmsVoteItem updateByUpdater(Updater<CmsVoteItem> updater);

	public CmsVoteItem deleteById(Integer id);
}