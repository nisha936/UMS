package com.imaginology.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.service.UserService;
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<User> createUser(@RequestBody User user){
		return userService.createUser(user);
	}
@RequestMapping(value="getalluser",method=RequestMethod.Get)
public List<User>getAllUsers(){
	return userService.getAllUsers();
}
@RequestMapping(value="{userId}",method=RequestMethod.Get){
	return userService.getUser(id);
}
}
