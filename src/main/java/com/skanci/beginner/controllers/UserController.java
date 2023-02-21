package com.skanci.beginner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skanci.beginner.entities.User;
import com.skanci.beginner.services.UserService;

@RestController
@RequestMapping(value="/users", consumes="application/json")
public class UserController {
	
	 private final UserService userService;
	  
	 @Autowired
	 public UserController(UserService userService) {
		 this.userService = userService;
	 }
	
	@PostMapping(value="/create")
	public User createUser(@RequestBody User user) {
		return userService.save(user);	
	}


}
