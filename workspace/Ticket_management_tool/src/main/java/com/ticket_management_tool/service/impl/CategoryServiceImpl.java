package com.ticket_management_tool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Category;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.CategoryRepo;
import com.ticket_management_tool.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryrepo;

	@Override
	public List<Category> getallCategory() throws ResourceNotFoundException {
		int len = categoryrepo.findAll().size();
		if (len == 0) {
			throw new ResourceNotFoundException("Fetch operation failed : Zero record present in category table ");

		}

		List<Category> list = categoryrepo.findAll();
		return list;
	}

	@Override
	public String deleteCategoryById(Integer id) throws ResourceNotFoundException {
		categoryrepo.findById(id).orElseThrow(()->
	   new ResourceNotFoundException("Delete operation failed : Entered category id "+id+" is not present in category table "));
		
		categoryrepo.deleteById(id);
		return "Category id :" +id +" deleted successfully : " ; 
		
	}

	@Override
	public Category createCategory(Category category) {
		
		Category c1 = categoryrepo.save(category);
		return c1;
	}

}