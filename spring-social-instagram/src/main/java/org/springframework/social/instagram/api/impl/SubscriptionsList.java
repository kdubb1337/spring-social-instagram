package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.Subscription;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SubscriptionsList {

    private List<Subscription> list;
    
    @JsonCreator
    public SubscriptionsList(@JsonProperty("data") List<Subscription> list) {
        this.list = list;
    }
    
    public List<Subscription> getList() {
        return list;
    }
}
