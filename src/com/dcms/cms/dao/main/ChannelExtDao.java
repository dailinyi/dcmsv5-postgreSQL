package com.dcms.cms.dao.main;

import com.dcms.cms.entity.main.ChannelExt;
import com.dcms.common.hibernate3.Updater;

public interface ChannelExtDao {
	public ChannelExt save(ChannelExt bean);

	public ChannelExt updateByUpdater(Updater<ChannelExt> updater);
}