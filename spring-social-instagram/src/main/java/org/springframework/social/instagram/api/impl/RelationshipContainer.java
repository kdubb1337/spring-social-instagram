package org.springframework.social.instagram.api.impl;

import java.io.IOException;

import org.springframework.social.instagram.api.Relationship;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using=RelationshipContainer.RelationshipContainerDeserializer.class)
public class RelationshipContainer extends AbstractInstagramResponseContainer<Relationship> {
    
    public RelationshipContainer(Relationship relationship) {
        super(relationship);
    }

    public static class RelationshipContainerDeserializer extends AbstractInstagramDeserializer<RelationshipContainer> {
        
        @Override public RelationshipContainer deserialize(JsonParser jp, DeserializationContext ctxt) 
                throws IOException, JsonProcessingException {
            return deserializeResponseObject(jp, RelationshipContainer.class, Relationship.class);
        }
    }
    
}
