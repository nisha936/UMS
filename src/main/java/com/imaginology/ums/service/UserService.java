package com.imaginology.ums.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;
<<<<<<< HEAD
import com.imaginology.ums.entity.User;
import com.imaginology.ums.repository.UserRepository;


=======

@Service
public class UserService {
@Autowired
UserRepository userRepository;
 public List<User> getAllUsers() {
		return userRepository.findAll();
	}

public Optional<User> getOneUser(Long id) {
	return userRepository.findById(id);
}
}
	
>>>>>>> 6071f2976114e1b6221c068f69ef47771abe1466
