package com.easy_pick.service;

import com.easy_pick.exception.UserException;
import com.easy_pick.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
