package com.user.service;

import org.springframework.stereotype.Service;
import com.user.entity.User;
import com.user.exceptions.UserNotFound;
import com.user.repository.UserRepository;

@Service

public class UserServiceImpl implements UserService{
	UserRepository userRepository;
	
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
    public User getUserById(int userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFound("User not found with id " + userId));
    }

	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFound("User not found with username " + username));
	}

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
//	public String AUthenticateUser(String username) {
//		
//	}
	

}
