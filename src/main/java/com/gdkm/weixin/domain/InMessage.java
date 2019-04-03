package com.gdkm.weixin.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class InMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("ToUserName")
	private String toUserName;
	
	@JsonProperty("FromUserName")
	private String fromUserName;
	
	@JsonProperty("CreateTime")	
	private long createTime;
	
	@JsonProperty("MsgType")
	private String msgType;
	
	@JsonProperty("MsgId")
	private String msgId;
	
}
