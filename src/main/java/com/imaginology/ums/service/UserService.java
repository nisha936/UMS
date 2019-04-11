package com.imaginology.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;
<<<<<<< HEAD
import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> createUser(User user){
		userRepository.save(user);
		List<User> users=userRepository.findAll();
		return users;
}
}
=======

@Service
public class UserService {
@Autowired
UserRepository userRepository;
 List<User> getAllUsers()
{
	return userRepository.findAll();
}


public getUser(Long id) {
	return userRepository.findById(id)
}
	
}
>>>>>>> 5ef41fee845efde101373687cc5bba55b3b80c6d
