package com.ticket_management_tool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.User;
import com.ticket_management_tool.exception.ResourceNotFoundException;

@Service
public interface UserService {
	
	List<User>getAllUser() throws ResourceNotFoundException;
	User createUser(User user);
	String deleteUserById(Integer id) throws ResourceNotFoundException;
	

}
