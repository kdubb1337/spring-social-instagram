package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.InstagramProfile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstagramProfileList {
	
	private List<InstagramProfile> list;
	
	@JsonCreator
	public InstagramProfileList(@JsonProperty("data") List<InstagramProfile> list) {
		this.list = list;
	}
	
	public List<InstagramProfile> getList() {
		return list;
	}

}
