package com.cg.onlineeyecare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TestIdNotFoundException extends RuntimeException {

	/**
	 * Test Id Not Found Exception.
	 */
	private static final long serialVersionUID = 1L;

	public TestIdNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestIdNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

