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
}



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
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
}
=======
>>>>>>> 6071f2976114e1b6221c068f69ef47771abe1466
>>>>>>> 577b451958a175ed4745eed5a57d34274c8d5594
>>>>>>> 18b11be6b02e9cbd5011626d5310b8974997c0f8
