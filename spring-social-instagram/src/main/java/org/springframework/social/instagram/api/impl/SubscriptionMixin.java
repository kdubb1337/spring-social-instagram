package org.springframework.social.instagram.api.impl;

import java.net.URI;

import org.springframework.social.instagram.api.Aspect;
import org.springframework.social.instagram.api.SubscriptionObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class SubscriptionMixin {
    @JsonCreator
    public SubscriptionMixin(
            @JsonProperty("id") String id,
            @JsonProperty("type") String type,
            @JsonProperty("object") SubscriptionObject object,
            @JsonProperty("object_id") String objectId,
            @JsonProperty("aspect") Aspect aspect,
            @JsonProperty("callback_url") URI callbackUrl) {}
    
}


