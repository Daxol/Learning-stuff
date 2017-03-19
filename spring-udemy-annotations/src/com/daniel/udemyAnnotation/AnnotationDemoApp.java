package com.daniel.udemyAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read psring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container

		Coach myCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		
		
		// close context

		context.close();
	}
}
