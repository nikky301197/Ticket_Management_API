package com.ticket_management_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_management_tool.entity.Category;
import com.ticket_management_tool.service.CategoryService;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
