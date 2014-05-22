package org.springframework.social.instagram.api.impl;

import java.util.List;

import org.springframework.social.instagram.api.Media;
import org.springframework.social.instagram.api.Pagination;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class PagedMediaListMixin {
    @JsonCreator
    PagedMediaListMixin(
            @JsonProperty("data") List<Media> media,
            @JsonProperty("pagination") Pagination pagination){}
}
