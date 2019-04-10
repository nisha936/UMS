package com.imaginology.ums.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imaginology.ums.service.UserService;

public class UserController {
	UserService userService;
	
	@RequestMapping(value="/{id} ", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id){
		return userService.deleteUser(id);
		
	}
}
