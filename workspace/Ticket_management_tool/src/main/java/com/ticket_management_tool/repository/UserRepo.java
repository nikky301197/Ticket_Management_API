package com.ticket_management_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket_management_tool.entity.User;
import java.util.List;
import java.util.Optional;




@Repository
public interface UserRepo extends JpaRepository<User, Integer>  {
	
	
	Optional<User> findByUserEmailAndPassword(String userEmail , String password);
    
}
