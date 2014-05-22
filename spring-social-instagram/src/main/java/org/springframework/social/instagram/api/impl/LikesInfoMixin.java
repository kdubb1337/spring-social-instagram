package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.InstagramProfile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class LikesInfoMixin {
	
	@JsonCreator
	LikesInfoMixin(
			@JsonProperty("count") int total,
			@JsonProperty("data") List<InstagramProfile> list) {}

}
