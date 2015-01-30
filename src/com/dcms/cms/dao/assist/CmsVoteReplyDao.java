package com.dcms.cms.dao.assist;

import com.dcms.cms.entity.assist.CmsVoteReply;
import com.dcms.common.hibernate3.Updater;
import com.dcms.common.page.Pagination;

public interface CmsVoteReplyDao {

	public Pagination getPage(Integer  subTopicId, int pageNo, int pageSize);
	
	public CmsVoteReply findById(Integer id);

	public CmsVoteReply save(CmsVoteReply bean);

	public CmsVoteReply updateByUpdater(Updater<CmsVoteReply> updater);

	public CmsVoteReply deleteById(Integer id);
}