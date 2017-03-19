package com.daniel.udemyAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach myCoach1 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (myCoach==myCoach1);
		
		System.out.println(result);

	}

}
