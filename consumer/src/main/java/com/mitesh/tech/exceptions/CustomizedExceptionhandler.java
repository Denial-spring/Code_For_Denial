package com.mitesh.tech.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@Controller
public class CustomizedExceptionhandler extends ResponseEntityExceptionHandler{

	//This method will handle all the exception which are not handled explicitly
	
	/*@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex,WebRequest request){
		
		ExcpetionResponse excpetionResponse = new ExcpetionResponse(new Date(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity(excpetionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}*/

	//This method will handle all the UserNotFoundException only
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotfoundException(Exception ex,WebRequest request){
		
		ExcpetionResponse excpetionResponse = new ExcpetionResponse(new Date(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity(excpetionResponse,HttpStatus.NOT_FOUND);
		
	}


	
	
	
}
