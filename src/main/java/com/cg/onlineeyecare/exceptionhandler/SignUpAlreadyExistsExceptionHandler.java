package com.cg.onlineeyecare.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.cg.onlineeyecare.exception.SignUsernameAlreadyExistsException;

@ControllerAdvice
public class SignUpAlreadyExistsExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value 
		      = { SignUsernameAlreadyExistsException.class})
		    protected ResponseEntity<Object> handleConflict(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = "An error occured: "+ex.getMessage();
		        return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		    }
}
