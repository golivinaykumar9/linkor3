package com.friend.springMVC.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.friend.springMVC.dao.UserSignUpDAO;
import com.friend.springMVC.model.UserSignUp;

@Service("userSignUpService")
@Transactional
public class UserSignUpServiceImpl implements UserSignUpService {
	
	@Autowired
	private UserSignUpDAO userSignUpDAO;
	
	@Override
	public boolean saveSignUp(UserSignUp userSignUp) {
		if(userSignUp != null){
			return userSignUpDAO.SaveSignUp(userSignUp);
		}
		return false;
	}
	
	public boolean test(){
		
		UserSignUp userSignUp = new UserSignUp();
		userSignUp.setCountry("INDIA");
		//userSignUp.setCreatedDate(new Date());
		//userSignUp.setDateOfBirth(new Date());
		userSignUp.setEmailId("asd@gmail.com");
		userSignUp.setPassword("asd");
		userSignUp.setStateIndicater("ACTIVE");
		userSignUp.setStatus("ACTIVE");
		userSignUp.setUserName("vinay");
		return saveSignUp(userSignUp);
		
		
	}
	

}
