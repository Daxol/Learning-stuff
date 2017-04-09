package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkput());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
	}

}
