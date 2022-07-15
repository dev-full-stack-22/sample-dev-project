package com.test.exception;

public class ErrorResponse {

	private final String message;

	ErrorResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
}
