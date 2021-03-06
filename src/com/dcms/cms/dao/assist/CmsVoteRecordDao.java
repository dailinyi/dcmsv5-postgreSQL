package com.dcms.cms.dao.assist;

import com.dcms.cms.entity.assist.CmsVoteRecord;

public interface CmsVoteRecordDao {
	public CmsVoteRecord save(CmsVoteRecord bean);

	public int deleteByTopic(Integer topicId);

	public CmsVoteRecord findByUserId(Integer userId, Integer topicId);

	public CmsVoteRecord findByIp(String ip, Integer topicId);

	public CmsVoteRecord findByCookie(String cookie, Integer topicId);
}