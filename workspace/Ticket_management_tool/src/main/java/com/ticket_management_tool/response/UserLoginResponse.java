package com.ticket_management_tool.response;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Component
public class UserLoginResponse {
	
	@Email
	@NotBlank
	String userEmail ; 
	@Size(min = 6 , max =15 , message = "Password must be 6 to 10 characters long ")
	String password;
	public UserLoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLoginResponse(String userEmail, String password) {
		super();
		this.userEmail = userEmail;
		this.password = password;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
