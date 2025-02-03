package com.user.service;

import com.user.entity.User;

public interface UserService {

	public User registerUser(User userDTO);
	
	public User getUserByUsername(String usename);

	User getUserById(int userId);
	

}
