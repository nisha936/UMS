package com.imaginology.ums.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;




public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> createUser(User user){
		userRepository.save(user);
		List<User> users=userRepository.findAll();
		return users;
}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

 public List<User> getAllUsers() {
		return userRepository.findAll();
	}

public Optional<User> getOneUser(Long id) {
	return userRepository.findById(id);
}
}

