package com.imaginology.ums.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imaginology.ums.service.UserService;
=======
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

>>>>>>> 999791879875ed6869f1d3985883228e39e865cd

public class UserController {
	UserService userService;
	
	@RequestMapping(value="/{id} ", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id){
		return userService.deleteUser(id);
		
	}
}
