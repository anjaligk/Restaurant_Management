package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.registerUser(user));
	}
	
	@GetMapping("/getuserbyId")
	public ResponseEntity<User> getByUserId(@PathVariable int userId){
		return ResponseEntity.ok(userService.getUserById(userId));
	}
	
	@GetMapping("/getuserbyName")
	public ResponseEntity<User> getUserByUsername(@PathVariable String userName){
		return ResponseEntity.ok(userService.getUserByUsername(userName));
	}
	
}
