package com.ticket_management_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_management_tool.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
