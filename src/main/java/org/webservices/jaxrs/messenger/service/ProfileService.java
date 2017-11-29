package org.webservices.jaxrs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.webservices.jaxrs.messenger.database.DatabaseClass;
import org.webservices.jaxrs.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("andes", new Profile(1L, "andes", "Srinivas","ANDE"));
		profiles.put("sande", new Profile(1L, "sande", "Sathvik","ANDE"));		
	}
	
	public List<Profile> getAllProfiles(){		
		return new ArrayList<Profile>(profiles.values());		
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void removeProfile(String profileName){
		profiles.remove(profileName);
	}	
}
