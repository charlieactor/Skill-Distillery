package com.skilldistillery.calc;

public class CannotDoThatException extends RuntimeException {
	public CannotDoThatException() {
		
	}
	public CannotDoThatException(String message) {
		super(message);
	}
	public CannotDoThatException(Throwable cause) {
		super(cause);
	}
}
