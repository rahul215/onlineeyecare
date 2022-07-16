package com.cg.onlineeyecare.exception;

public class ReportIdAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 225636108272454893L;

	public ReportIdAlreadyExistsException(String message) {
		super(message);
	}

}
