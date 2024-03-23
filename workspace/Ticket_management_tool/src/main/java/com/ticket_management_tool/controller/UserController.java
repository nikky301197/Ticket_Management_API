package com.ticket_management_tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket_management_tool.entity.User;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.UserRepo;

import com.ticket_management_tool.response.UserLoginResponse;
import com.ticket_management_tool.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ticket_management_tool/users")
public class UserController {

	@Autowired
	UserService userservice;
	@Autowired
	UserRepo repo;

	@GetMapping("/")
	ResponseEntity<List<User>> getAllUser() throws ResourceNotFoundException {
		List<User> list = userservice.getAllUser();

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@PostMapping("/register")
	ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
		User u1 = userservice.createUser(user);
		return new ResponseEntity<User>(u1, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	ResponseEntity<String> deleteUserById(@PathVariable Integer id) throws ResourceNotFoundException {
		userservice.deleteUserById(id);
		return new ResponseEntity<String>("Delete Operation successfully executed!! : user id " + id + " deleted",
				HttpStatus.OK);
	}

	@PostMapping("/login")
	ResponseEntity<User> loginUser(@RequestBody UserLoginResponse loginresponse) throws ResourceNotFoundException {

//	System.out.println(loginresponse.getUserEmail());
//	System.out.println(loginresponse.getPassword());
//	return repo.findByUserEmailAndPassword(loginresponse.getUserEmail(), loginresponse.getPassword());
//	
		User user = userservice.loginUser(loginresponse);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
