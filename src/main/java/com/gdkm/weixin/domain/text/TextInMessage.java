package com.gdkm.weixin.domain.text;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gdkm.weixin.domain.InMessage;

public class TextInMessage extends InMessage {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
