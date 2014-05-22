package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.Comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CommentList {
	
	private List<Comment> list;
	
	public CommentList(@JsonProperty("data") List<Comment> list) {
		this.list = list;
	}
	
	public List<Comment> getList() {
		return list;
	}
	
}
