package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifeCycle-applicationContext.xml");
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		boolean result = (coach1 == coach2);
		System.out.println("Is the object's are same: "+result);
		System.out.println("Memory of the Coach1: " + coach1);
		System.out.println("Memory of the Coach2: " + coach2);
		context.close();
	}

}
