package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.ChannelTxt;
import com.dcms.common.hibernate3.Updater;

public interface ChannelTxtDao {
	public ChannelTxt findById(Integer id);

	public ChannelTxt save(ChannelTxt bean);

	public ChannelTxt updateByUpdater(Updater<ChannelTxt> updater);
}