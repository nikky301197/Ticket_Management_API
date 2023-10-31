package com.ticket_management_tool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Role;
import com.ticket_management_tool.exception.ResourceNotFoundException;

@Service
public interface RoleService {

	List<Role> getAllRoles() throws ResourceNotFoundException;

	Role createRole(Role role);

	String deleteRoleById(Integer id) throws ResourceNotFoundException;
}
