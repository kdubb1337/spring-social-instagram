package org.springframework.social.instagram.api.impl;

import java.io.IOException;

import org.springframework.social.instagram.api.InstagramProfile;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;

public class InstagramProfileContainerDeserializer extends AbstractInstagramDeserializer<InstagramProfileContainer> {

	@Override
	public InstagramProfileContainer deserialize(JsonParser jp, DeserializationContext ctxt) 
			throws IOException, JsonProcessingException {
		return deserializeResponseObject(jp, InstagramProfileContainer.class, InstagramProfile.class);
	}

}
