package com.imaginology.ums.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> 5ef41fee845efde101373687cc5bba55b3b80c6d
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.service.UserService;


public class UserController {
	@Autowired
	UserService userService;
	
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<User> createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	@RequestMapping(value="/{Id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

@RequestMapping(value="getalluser",method=RequestMethod.Get)
public List<User>getAllUsers(){
	return userService.getAllUsers();
}
@RequestMapping(value="{userId}",method=RequestMethod.Get){
	return userService.getUser(id);
}

}
