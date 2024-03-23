package com.ticket_management_tool.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserCentralizedExceptionHandling {

	@ExceptionHandler(ResourceNotFoundException.class)
	ResponseEntity<ApiErrorResponse> resourceNotFoundException(ResourceNotFoundException ex) {
		String msg = ex.getMessage();
		String error = "Resource Not Found Exception";
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;

		ApiErrorResponse apierr = new ApiErrorResponse(error, msg, httpStatus);

		return new ResponseEntity<ApiErrorResponse>(apierr, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<ApiErrorResponse> methodArgumentNotValidException(MethodArgumentNotValidException ex) {
		ObjectError obj = ex.getBindingResult().getAllErrors().get(0);
		String fieldName = ((FieldError) obj).getField();

		String msg = "CLASS NAME : " + obj.getObjectName() + " , FIELD NAME : " + fieldName
				+ " , ISSUE  : " + obj.getDefaultMessage();
		
		

		String error = "Method Argument Not Valid Exception";
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

		ApiErrorResponse apierr = new ApiErrorResponse(error, msg, httpStatus);

		return new ResponseEntity<ApiErrorResponse>(apierr, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	ResponseEntity<ApiErrorResponse> sqlIntegrityConstraintViolationException(
			SQLIntegrityConstraintViolationException ex) {

		String msg = "";
		String error = "";
		HttpStatus httpStatus = null;

		ApiErrorResponse apierr = new ApiErrorResponse();

		if (ex.getMessage().contains("foreign key constraint fails")) {
			msg = "Cannot add or update a child row because entered id is not present in parent table (Role)";
			error = "Foreign Key Constraint Failed Exception";
			httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			apierr.setError(error);
			apierr.setMessage(msg);
			apierr.setHttpstatus(httpStatus);

		} else {
			msg = ex.getMessage();
			error = "SQL Integrity Constraint Violation Exception";
			httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
			apierr.setError(error);
			apierr.setMessage(msg);
			apierr.setHttpstatus(httpStatus);

		}
		return new ResponseEntity<ApiErrorResponse>(apierr, httpStatus);
	}
}
