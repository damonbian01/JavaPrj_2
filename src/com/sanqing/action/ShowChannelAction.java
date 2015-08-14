package com.sanqing.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.bean.Channel;
import com.sanqing.dao.ChannelDAO;
import com.sanqing.daoFactory.ChannelDAOFactory;

public class ShowChannelAction extends ActionSupport {
	private List<Channel> channels = new ArrayList<Channel>();
	
	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public String execute() throws Exception {
		ChannelDAO channelDAO = ChannelDAOFactory.getChannelDAOInstance();
		channels = channelDAO.getAllChannel();
		return this.SUCCESS;
	}
	
}
