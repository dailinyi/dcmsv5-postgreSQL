package com.dcms.cms.manager.main;

import com.dcms.cms.entity.main.Channel;
import com.dcms.cms.entity.main.ChannelExt;

public interface ChannelExtMng {
	public ChannelExt save(ChannelExt ext, Channel channel);

	public ChannelExt update(ChannelExt ext);
}