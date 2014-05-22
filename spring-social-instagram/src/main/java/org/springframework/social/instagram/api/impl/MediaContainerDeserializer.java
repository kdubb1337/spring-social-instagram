package org.springframework.social.instagram.api.impl;

import java.io.IOException;

import org.springframework.social.instagram.api.Media;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;

public class MediaContainerDeserializer extends AbstractInstagramDeserializer<MediaContainer> {

	@Override
	public MediaContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		return deserializeResponseObject(jp, MediaContainer.class, Media.class);
	}
	
}
