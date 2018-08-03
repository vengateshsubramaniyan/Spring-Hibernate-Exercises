package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		boolean result = (coach == coach1);
		System.out.println("Same: "+ result);
		System.out.println(coach);
		System.out.println(coach1);
		context.close();
	}

}
