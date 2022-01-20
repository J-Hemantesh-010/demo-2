package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;
   
public class IUserService {
	@Autowired
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
