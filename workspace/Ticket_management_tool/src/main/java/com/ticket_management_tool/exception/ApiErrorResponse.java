package com.ticket_management_tool.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class ApiErrorResponse {

	private String error ;
	private String message;
	private HttpStatus httpstatus;
	
	public ApiErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiErrorResponse(String error, String message, HttpStatus httpstatus) {
		super();
		this.error = error;
		this.message = message;
		this.httpstatus = httpstatus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	

}
