package com.friend.springMVC.service;

import java.util.List;

import com.friend.springMVC.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
