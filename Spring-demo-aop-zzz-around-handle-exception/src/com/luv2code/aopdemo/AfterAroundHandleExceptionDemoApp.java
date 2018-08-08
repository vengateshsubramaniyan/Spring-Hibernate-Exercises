package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AfterAroundHandleExceptionDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		String forturne;
		boolean strip = true;
		forturne = fortuneService.getFortune(strip);
		System.out.println("Back to the Main App................");
		System.out.println("Your today's fortune : " + forturne);
		System.out.println("Finished");
		context.close();
	}

}
