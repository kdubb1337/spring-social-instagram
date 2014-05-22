package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.Media;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MediaList {
	
	private List<Media> list;
	
	@JsonCreator
	public MediaList(@JsonProperty("data") List<Media> list) {
		this.list = list;
	}
	
	public List<Media> getList() {
		return list;
	}
}
