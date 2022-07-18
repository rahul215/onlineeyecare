package com.cg.onlineeyecare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST)
public class PatientIdNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public PatientIdNotFoundException() {
		super();
	}
	
	public PatientIdNotFoundException(String errMsg) {
		super(errMsg);
	}
}
