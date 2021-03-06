package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println("theCoach" +theCoach);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		System.out.println("alpha: "+alphaCoach);
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		context.close();
	}
}
