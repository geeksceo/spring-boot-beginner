package com.skanci.beginner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skanci.beginner.entities.User;
import com.skanci.beginner.repositories.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User save(User user) {
		return this.userRepository.save(user);
	}
	 
	public User getUserById(long id) {
		return this.userRepository.findById(id)
				.orElse(null);
	}
	
	public List<User> findAll(){
		return (List<User>) this.userRepository.findAll();
	}
	
}
