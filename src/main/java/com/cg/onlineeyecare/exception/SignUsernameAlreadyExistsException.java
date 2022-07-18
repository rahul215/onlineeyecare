package com.cg.onlineeyecare.exception;

public class SignUsernameAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 225636108272454893L;
	
	public SignUsernameAlreadyExistsException(String message) {
		super(message);
	}
}
