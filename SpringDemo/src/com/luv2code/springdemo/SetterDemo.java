package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println("Email Address: "+ coach.getEmail());
		System.out.println("Team         : "+ coach.getTeam());
		context.close();
	}

}
