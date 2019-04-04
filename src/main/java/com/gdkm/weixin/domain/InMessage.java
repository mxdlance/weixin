package com.gdkm.weixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class InMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ToUserName")
	@JsonProperty("ToUserName")
	private String toUserName;
	
	@XmlElement(name = "FromUserName")
	@JsonProperty("FromUserName")
	private String fromUserName;
	
	@XmlElement(name = "CreateTime")
	@JsonProperty("CreateTime")	
	private long createTime;
	
	@XmlElement(name = "MsgType")
	@JsonProperty("MsgType")
	private String msgType;
	
	@XmlElement(name = "MsgId")
	@JsonProperty("MsgId")
	private String msgId;
	
}
