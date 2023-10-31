package com.ticket_management_tool.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer cateagory_id ; 
	String category_name ;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer cateagory_id, String category_name) {
		super();
		this.cateagory_id = cateagory_id;
		this.category_name = category_name;
	}
	public Integer getCateagory_id() {
		return cateagory_id;
	}
	public void setCateagory_id(Integer cateagory_id) {
		this.cateagory_id = cateagory_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	

}
