package com.gdkm.weixin.domain.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gdkm.weixin.domain.InMessage;

public class ImageInMessage extends InMessage {

	private static final long serialVersionUID = 1L;

	@JsonProperty("PicUrl")
	private String imageUrl;
	
	@JsonProperty("MediaId")
	private String mediaId;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
