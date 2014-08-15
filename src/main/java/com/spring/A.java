package com.spring;


public class A {
	
	private String message = "hello ";
	
	public A() {
		super();
		System.out.println("A instance created..");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
