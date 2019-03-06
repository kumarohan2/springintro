package com.lti.component;

import org.springframework.stereotype.Component;

@Component("s") //bean id
public class Shape {

	public void draw() {
		System.out.println("draw");
	}
	
}
