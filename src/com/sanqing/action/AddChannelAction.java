package com.sanqing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.bean.Channel;
import com.sanqing.dao.ChannelDAO;
import com.sanqing.daoFactory.ChannelDAOFactory;

public class AddChannelAction extends ActionSupport {
	private String channelName;		//·â×°ÆµµÀÃû³Æ

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String execute() throws Exception {
		ChannelDAO channelDAO = ChannelDAOFactory.getChannelDAOInstance();
		Channel channel = new Channel();
		channel.setChannelName(channelName);
		channelDAO.addChannel(channel);
		return this.SUCCESS;
	}
	
}
