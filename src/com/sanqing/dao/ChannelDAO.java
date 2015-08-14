package com.sanqing.dao;

import java.util.List;

import com.sanqing.bean.Channel;

public interface ChannelDAO {
	public void addChannel(Channel channel);
	public List<Channel> getAllChannel();
}
