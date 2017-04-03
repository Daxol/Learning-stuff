package com.daniel.udemyAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read psring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container

		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail() + " " + myCoach.getTeam());
		
		// close context

		context.close();
	}
}
