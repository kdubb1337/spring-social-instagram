package org.springframework.social.instagram.api;

import java.util.HashMap;
import java.util.Map;

public class InstagramProfile {
	
	private final String id;
	private final String profilePictureUrl;
	private final String username;
	private final Map<String,Integer> counts;
	private final String fullName;
	private String bio;
	private String website;
	private String firstName;
	private String lastName;
	
	public InstagramProfile(String id, String username, String fullName, String profilePictureUrl, Map<String,Integer> counts) {
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.profilePictureUrl = profilePictureUrl;
		
		if(counts == null)
			counts = new HashMap<String, Integer>();
			
		this.counts = counts;
	}
	
	public String getId() {
		return id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}
	
	public String getUsername() {
		return username;
	}

	public Map<String,Integer> getCounts() {
		return counts;
	}	
	
	public Integer getMediaCount() {
	    return counts.get("media");
	}
	
	public Integer getFollowsCount() {
	    return counts.get("follows");
	}
	
    public Integer getFollowedBy() {
        return counts.get("followed_by");
    }

	public String getBio() {
		return bio;
	}

	public String getWebsite() {
		return website;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
