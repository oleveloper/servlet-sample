package com.demo.service;

public class ParentsException extends RuntimeException {
	ParentsException() {

	}

	ParentsException(String message) {
		super(message);
	}

	public void triggerParentsException() {
		System.out.println("This is a Parents exception trigger");
		throw new ParentsException("An exception occurred in [PARENTS]");
	}
}
