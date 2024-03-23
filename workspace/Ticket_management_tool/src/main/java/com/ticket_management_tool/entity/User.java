package com.ticket_management_tool.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@NotBlank(message = "User name cannot be blank")
	private String userName;
	@Size(min = 6, max = 15, message = "Password must be 6 to 15 characters long")
	private String password;
	@Email
	@Column(unique = true)
	private String userEmail;
	@Size(min = 10, max = 10 , message = "Phone number contain 10 digits only ")
	@Digits(fraction = 0, integer = 10)
	private String phoneNumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, @NotBlank(message = "User name cannot be blank") String userName,
			@Size(min = 6, max = 15, message = "Password must be 6 to 15 characters long") String password,
			@Email String userEmail,
			@Size(min = 10, max = 10, message = "Phone number contain 10 digits only ") @Digits(fraction = 0, integer = 10) String phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userEmail = userEmail;
		this.phoneNumber = phoneNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

}
