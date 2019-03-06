package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Atminterface;
import com.lti.component.Calculator;
import com.lti.component.HelloWorld;
import com.lti.component.Shape;
import com.lti.component.TextEditor;

public class SpringTest {

	@Test
	public void test() {

		// Loading Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		// Accessing one of the Beans
		HelloWorld h = (HelloWorld) ctx.getBean("hw");
		System.out.println(h.sayHello("Rohan"));
	}

	@Test
	public void cal() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		//Calculator c = (Calculator) ctx.getBean("cal");
	//	System.out.println(c.add(2, 3));
		//System.out.println(c.sub(10, 5));
		
		//Shape s = (Shape) ctx.getBean("s");
		//s.draw();
 
		//TextEditor t= (TextEditor)ctx.getBean("txt");
			//t.loadDocument("abc.txt");
		Atminterface atm=(Atminterface) ctx.getBean("atm");
		atm.atmcard(1234, 100);
	}
	
	

}
