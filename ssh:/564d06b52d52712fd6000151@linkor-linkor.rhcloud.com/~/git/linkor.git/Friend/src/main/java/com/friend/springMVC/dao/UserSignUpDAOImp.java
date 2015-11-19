package com.friend.springMVC.dao;

import org.springframework.stereotype.Repository;

import com.friend.springMVC.model.UserSignUp;


@Repository("userSignUpDAO")
public class UserSignUpDAOImp extends AbstractDao<Integer, UserSignUp> implements UserSignUpDAO {

	@Override
	public boolean SaveSignUp(UserSignUp userSignUp) {
		if(userSignUp != null){
			persist(userSignUp);
		}
		return false;
	}
	

}
