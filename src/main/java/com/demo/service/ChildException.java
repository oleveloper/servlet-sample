package com.demo.service;

public class ChildException extends ParentsException {
	ChildException() {

	}

	public ChildException(String message) {
		super(message);
	}

	public void triggerChildException() {
		System.out.println("This is a Child exception trigger");
		throw new ChildException("An exception occurred in [CHILD]");
	}
}
