package com.cg.onlineeyecare.exception;

public class ReportIdNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -512056536889030695L;
	
	public ReportIdNotFoundException() {
		super();
	}

	public ReportIdNotFoundException(String message) {
		super(message);
	}

}
