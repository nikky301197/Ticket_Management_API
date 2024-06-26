package com.ticket_management_tool.service.impl;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.User;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.UserRepo;
import com.ticket_management_tool.response.UserLoginResponse;
import com.ticket_management_tool.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userrepo;

	@Override
	public List<User> getAllUser() throws ResourceNotFoundException {

		int len = userrepo.findAll().size();
		if (len == 0) {
			throw new ResourceNotFoundException("Fetch operation failed : Zero record present in user table ");
		}

		List<User> list = userrepo.findAll();
		return list;

	}

	@Override
	public User createUser(User user) {

		return userrepo.save(user);
	}

	@Override
	public String deleteUserById(Integer id) throws ResourceNotFoundException {
		userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(
				"Delete operation failed : Entered user id " + id + " is not present in user table"));
		userrepo.deleteById(id);
		return null;
	}

	@Override
	public User loginUser(UserLoginResponse response) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		User user = userrepo.findByUserEmailAndPassword(response.getUserEmail(), response.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException(
						"Fetch operation failed : No record present with email id " + response.getUserEmail()));

		return user;

	}

}
