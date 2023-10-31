package com.ticket_management_tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket_management_tool.entity.Category;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.service.CategoryService;

@RestController
@RequestMapping("/ticket_management_tool/category")
public class CategoryController {

	@Autowired
	CategoryService categoryservice;

	@GetMapping("/")
	ResponseEntity<List<Category>> getAllCategory() throws ResourceNotFoundException {
		List<Category> list = categoryservice.getallCategory();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	ResponseEntity<String> deleteCategoryById(@PathVariable Integer id) throws ResourceNotFoundException {
		String msg = categoryservice.deleteCategoryById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@PostMapping("/")
	ResponseEntity<Category> createCategory(@RequestBody Category category) {
		Category c1 = categoryservice.createCategory(category);
		return new ResponseEntity<Category>(c1, HttpStatus.CREATED);
	}
}
