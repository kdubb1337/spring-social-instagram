package org.springframework.social.instagram.connect;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InstagramOAuth2Template extends OAuth2Template {
	
	private final String clientId;
	private final String clientSecret;
	private static final Logger LOG = LogManager.getLogger(InstagramOAuth2Template.class);
	
	public InstagramOAuth2Template(String clientId, String clientSecret) {
		super(clientId, clientSecret, "https://api.instagram.com/oauth/authorize/", "https://api.instagram.com/oauth/access_token");
		
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}
	
	@Override
	protected RestTemplate createRestTemplate() {
		RestTemplate restTemplate = new RestTemplate(ClientHttpRequestFactorySelector.getRequestFactory());
		FormHttpMessageConverter messageConverter = new FormHttpMessageConverter() {
			public boolean canRead(Class<?> clazz, MediaType mediaType) {
				return true;
			}
		};
		restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(messageConverter));
		return restTemplate;
	}
	
	@Override
	@SuppressWarnings("unchecked")	
	protected AccessGrant postForAccessGrant(String accessTokenUrl, MultiValueMap<String, String> parameters) {
		ObjectMapper mapper = new ObjectMapper();
		
		parameters.set("client_id", clientId);
		parameters.set("client_secret", clientSecret);
		
		// TODO: Look into weird JSON response bug.
		Map<String,Object> response = getRestTemplate().postForObject(accessTokenUrl, parameters, Map.class);
		Entry<String,Object> entry = response.entrySet().iterator().next();
		String jsonString = entry.getKey();
		Map<String, String> response2 = null;
		
		try {
			response2 = mapper.readValue(jsonString, Map.class);
		} catch (Exception e) {
			LOG.error("Failed to read map", e);
		}
		
		String accessToken = response2.get("access_token");
		return new AccessGrant(accessToken, null, null, null);
	}
}