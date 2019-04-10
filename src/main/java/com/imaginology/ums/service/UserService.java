package com.imaginology.ums.service;

import com.imaginology.ums.repository.UserRepository;

public class UserService {
	UserRepository userRepository ;
	
	public void deleteUser() {
		return userRepository.deleteUserById(id);
	}

}
