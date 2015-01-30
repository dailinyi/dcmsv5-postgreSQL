package com.dcms.cms.manager.assist.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcms.cms.dao.assist.CmsReceiverMessageDao;
import com.dcms.cms.entity.assist.CmsReceiverMessage;
import com.dcms.cms.manager.assist.CmsReceiverMessageMng;
import com.dcms.common.page.Pagination;



@Service
@Transactional
public class CmsReceiverMessageMngImpl implements CmsReceiverMessageMng {

	public Pagination getPage(Integer siteId, Integer sendUserId,
			Integer receiverUserId, String title, Date sendBeginTime,
			Date sendEndTime, Boolean status, Integer box, Boolean cacheable,
			int pageNo, int pageSize) {
		return dao.getPage(siteId, sendUserId, receiverUserId, title,
				sendBeginTime, sendEndTime, status, box, cacheable, pageNo,
				pageSize);
	}
	
	public List getList(Integer siteId, Integer sendUserId,
			Integer receiverUserId, String title, Date sendBeginTime,
			Date sendEndTime, Boolean status, Integer box, Boolean cacheable) {
		return dao.getList(siteId, sendUserId, receiverUserId, title,
				sendBeginTime, sendEndTime, status, box, cacheable);
	}

	public CmsReceiverMessage findById(Integer id) {
		return dao.findById(id);
	}

	public CmsReceiverMessage save(CmsReceiverMessage bean) {
		return dao.save(bean);
	}

	public CmsReceiverMessage update(CmsReceiverMessage bean) {
		return dao.update(bean);
	}

	public CmsReceiverMessage deleteById(Integer id) {
		return dao.deleteById(id);
	}

	public CmsReceiverMessage[] deleteByIds(Integer[] ids) {
		return dao.deleteByIds(ids);
	}

	@Autowired
	private CmsReceiverMessageDao dao;

}
