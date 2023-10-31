package com.ticket_management_tool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Role;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.RoleRepo;
import com.ticket_management_tool.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepo rolerepo;

	@Override
	public List<Role> getAllRoles() throws ResourceNotFoundException {
		int length = rolerepo.findAll().size();
		if (length != 0) {
			return rolerepo.findAll();
		} else {
			throw new ResourceNotFoundException("Fetch operation failed : Zero record present in role table ");
		}
	}

	@Override
	public Role createRole(Role role) {
		
		return rolerepo.save(role);
	}

	@Override
	public String deleteRoleById(Integer id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		rolerepo.findById(id).orElseThrow
		(() -> new ResourceNotFoundException("Delete operation failed : Entered role id "+id+" is not present in role table  "));
		rolerepo.deleteById(id);
		return "Role id :" +id +" deleted successfully : " ;

	}

}
