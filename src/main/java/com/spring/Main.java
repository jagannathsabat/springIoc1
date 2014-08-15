package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	static A a;
	static B b;
	
	public A getA() {
		return a;
	}

	@Autowired
	public void setA(A a) {
		this.a = a;
	}


	public B getB() {
		return b;
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}


	public static void main(String[] args) {		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println(a.getMessage() + b.getMessage());
	}

}
