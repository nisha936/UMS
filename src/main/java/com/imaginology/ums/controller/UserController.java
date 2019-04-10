package com.imaginology.ums.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.imaginology.ums.entity.User;

public class UserController {
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<User> createUser(@RequestBody User user){
		return userService.createUser(user);
	}


}
