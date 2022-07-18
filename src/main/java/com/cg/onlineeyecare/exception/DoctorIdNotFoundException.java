package com.cg.onlineeyecare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST)
public class DoctorIdNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DoctorIdNotFoundException() {
		super();
	}
	public DoctorIdNotFoundException(String errMsg) {
		super(errMsg);
	}
}
