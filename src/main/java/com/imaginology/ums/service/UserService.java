package com.imaginology.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
 List<User> getAllUsers()
{
	return userRepository.findAll();
=======

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
>>>>>>> 793c4bcf8c4dcb792b94d36f28759ea57ac935a4
}
}