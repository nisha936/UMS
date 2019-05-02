package com.imaginology.ums.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> 5ef41fee845efde101373687cc5bba55b3b80c6d
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 577b451958a175ed4745eed5a57d34274c8d5594
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.ums.entity.User;
import com.imaginology.ums.service.UserService;

=======
<<<<<<< HEAD
>>>>>>> 577b451958a175ed4745eed5a57d34274c8d5594

public class UserController {
	@Autowired
	UserService userService;
<<<<<<< HEAD
	

=======
<<<<<<< HEAD
	
=======
	@PostMapping
=======
>>>>>>> 577b451958a175ed4745eed5a57d34274c8d5594
>>>>>>> 18b11be6b02e9cbd5011626d5310b8974997c0f8
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;


	@ResponseStatus(code=HttpStatus.CREATED)
	public List<User> createUser(@RequestBody User user){
		return userService.createUser(user);
	}
<<<<<<< HEAD


=======
	@RequestMapping(value="/{Id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

@RequestMapping(value="getalluser",method=RequestMethod.Get)
=======
>>>>>>> 18b11be6b02e9cbd5011626d5310b8974997c0f8
	//@ResponseStatus(code=HttpStatus.CREATED)
	//public List<User> createUser(@RequestBody User user){
	//	return userService.createUser(user);
	//}
@RequestMapping(value="getalluser",method=RequestMethod.GET)

public List<User>getAllUsers(){
	return userService.getAllUsers();
}
@RequestMapping(value="/{userId}", method=RequestMethod.GET)
public  Optional<User> getOneUser(@PathVariable Long id) {
	return userService.getOneUser(id);
}
<<<<<<< HEAD
=======
	
	}
}

>>>>>>> 577b451958a175ed4745eed5a57d34274c8d5594

