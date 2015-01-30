package com.dcms.cms.manager.assist;

import java.util.List;
import java.util.Set;

import com.dcms.cms.entity.assist.CmsVoteSubTopic;
import com.dcms.cms.entity.assist.CmsVoteTopic;
import com.dcms.cms.entity.main.CmsUser;
import com.dcms.common.page.Pagination;

public interface CmsVoteTopicMng {
	public Pagination getPage(Integer siteId, int pageNo, int pageSize);
	
	public List<CmsVoteTopic> getList(Boolean def,Integer siteId, int count);

	public CmsVoteTopic findById(Integer id);

	public CmsVoteTopic getDefTopic(Integer siteId);

	public CmsVoteTopic vote(Integer topicId,Integer[]subIds, List<Integer[]> itemIds,String[]replys, CmsUser user,
			String ip, String cookie);

	public CmsVoteTopic save(CmsVoteTopic bean, Set<CmsVoteSubTopic> subTopics);

	public CmsVoteTopic update(CmsVoteTopic bean);

	public CmsVoteTopic deleteById(Integer id);

	public CmsVoteTopic[] deleteByIds(Integer[] ids);
}