package com.friend.springMVC.dao;

import java.util.List;

import com.friend.springMVC.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
