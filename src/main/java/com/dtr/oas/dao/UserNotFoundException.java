package com.dtr.oas.dao;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 6719064220453613755L;

	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
