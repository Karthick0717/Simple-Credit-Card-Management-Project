package com.creditCardManagementSystem.exceptions;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException ex, HttpServletRequest request){
		
		ErrorResponse errorResponse = new ErrorResponse (
				                             LocalDateTime.now(),
				                             ex.getMessage(),
				                             request.getRequestURI()
				                             ,"RESOURCE_NOT_FOUND");
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	(InsufficientLimitException.class)
	public ResponseEntity<ErrorResponse> handleInsufficientLimit(InsufficientLimitException ex, HttpServletRequest request){
		
		ErrorResponse errorResponse = new ErrorResponse (
				                                LocalDateTime.now(),
				                                ex.getMessage(),
				                                request.getRequestURI(),
				                                "INSUFFICIENT_LIMIT");
		
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler
	(InvalidRequestException.class)
	public ResponseEntity<ErrorResponse> handleInvalidRequest (InvalidRequestException ex, HttpServletRequest request){
		
		ErrorResponse errorResponse = new ErrorResponse (
				                                 LocalDateTime.now(),
				                                 ex.getMessage(),
				                                 request.getRequestURI(),
				                                 "INVALID_REQUEST");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
		
		
	}
	// Validation Error 
	@ExceptionHandler
	(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidationError(MethodArgumentNotValidException ex, HttpServletRequest request){
		
		StringBuilder message = new StringBuilder();
		
		for(FieldError field : ex.getBindingResult().getFieldErrors()) {
			
			message.append(field.getField())
			       .append(": ")
			       .append(field.getDefaultMessage())
			       .append("; ");
			
		}
		
		ErrorResponse errorResp = new ErrorResponse(
				LocalDateTime.now(), 
				ex.getMessage(), 
				request.getRequestURI(), 
				"VALIDATION_FAILED");
		return new ResponseEntity<ErrorResponse>(errorResp,HttpStatus.BAD_REQUEST);
	}
	
	//Generic Error - Errors except the above 
	@ExceptionHandler
	(Exception.class)
	public ResponseEntity<ErrorResponse> handleGenericExceptions(Exception ex, HttpServletRequest request) {
		
		ErrorResponse error = new ErrorResponse(
				                              LocalDateTime.now(),
				                               "An unexpected error occured",
				                               request.getRequestURI(),
				                               "SERVER ERROR");
		ex.printStackTrace();
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	

}
