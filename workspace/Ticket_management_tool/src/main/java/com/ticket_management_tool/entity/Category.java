package com.ticket_management_tool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer cateagoryId ; 
	String categoryName ;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer cateagoryId, String categoryName) {
		super();
		this.cateagoryId = cateagoryId;
		this.categoryName = categoryName;
	}
	public Integer getCateagoryId() {
		return cateagoryId;
	}
	public void setCateagoryId(Integer cateagoryId) {
		this.cateagoryId = cateagoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
