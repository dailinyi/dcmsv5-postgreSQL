package com.dcms.cms.manager.main.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcms.cms.dao.main.CmsUserResumeDao;
import com.dcms.cms.entity.main.CmsUser;
import com.dcms.cms.entity.main.CmsUserResume;
import com.dcms.cms.manager.main.CmsUserResumeMng;
import com.dcms.common.hibernate3.Updater;

@Service
@Transactional
public class CmsUserResumeMngImpl implements CmsUserResumeMng {
	public CmsUserResume save(CmsUserResume resume, CmsUser user) {
		resume.setUser(user);
		dao.save(resume);
		return resume;
	}

	public CmsUserResume update(CmsUserResume ext, CmsUser user) {
		CmsUserResume entity = dao.findById(user.getId());
		if (entity == null) {
			entity = save(ext, user);
			user.getUserResumeSet().add(entity);
			return entity;
		} else {
			Updater<CmsUserResume> updater = new Updater<CmsUserResume>(ext);
			ext = dao.updateByUpdater(updater);
			return ext;
		}
	}

	private CmsUserResumeDao dao;

	@Autowired
	public void setDao(CmsUserResumeDao dao) {
		this.dao = dao;
	}
}