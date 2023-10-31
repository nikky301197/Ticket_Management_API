package com.ticket_management_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import com.ticket_management_tool.entity.User;


public interface UserRepo extends JpaRepository<User, Integer>  {
	

}
