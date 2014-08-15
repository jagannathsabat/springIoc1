package com.spring;


public class B {

	private String message = "World";

	
	public B() {
		super();
		System.out.println("B instance created..");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
