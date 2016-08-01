package org.shuhrat.testing.service;

import org.shuhrat.testing.DateBaseClass;
import org.shuhrat.testing.model.Message;
import org.shuhrat.testing.model.Profile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 01.08.2016.
 */
public class ProfileService {
    Map<String, Profile> profileMap= DateBaseClass.getProfileMap();

    public ProfileService() {
        if (profileMap.size()==0){
            profileMap.put("Paul", new Profile(1,"Paul", "Paule Merdi", new Date()));
            profileMap.put("Linda", new Profile(2,"Linda", "Linda Driler", new Date()));
            profileMap.put("Sasha", new Profile(3,"Sasha", "Sasha Driler", new Date()));
        }
    }

    public List<Profile> getAll(){
        return new ArrayList (profileMap.values());
    }

    public Profile getProfile(String name){
        return profileMap.get(name);
    }

    public Profile putProfile(String name, Profile profile){
        profileMap.put(name, profile);
        return profileMap.get(name);

    }

    public Profile postProfile(Profile profile){
        profile.setId(profileMap.size()+1);
        profileMap.put(profile.getName() , profile);
        return profile;
    }

    public void delProfile(String name){
        profileMap.remove(name);
    }
}
