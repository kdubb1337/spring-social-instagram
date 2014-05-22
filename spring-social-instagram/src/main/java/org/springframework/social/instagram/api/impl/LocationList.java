package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.Location;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LocationList {
	
	private List<Location> list;
	
	public LocationList(@JsonProperty("data") List<Location> list) {
		this.list = list;
	}
	
	public List<Location> getList() {
		return list;
	}
	
}
