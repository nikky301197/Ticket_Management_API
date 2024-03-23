package com.ticket_management_tool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.User;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.response.UserLoginResponse;


@Service
public interface UserService {
	
	List<User>getAllUser() throws ResourceNotFoundException;
	User createUser(User user);
	String deleteUserById(Integer id) throws ResourceNotFoundException;
	User loginUser(UserLoginResponse response) throws ResourceNotFoundException;
	

}
