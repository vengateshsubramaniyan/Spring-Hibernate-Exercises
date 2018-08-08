package com.luv2code.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AfterAroundWithLoggerDemoApp {

	public static void main(String[] args) {
		Logger mLogger = Logger.getLogger(AfterAroundDemoApp.class.getName());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		String forturne = fortuneService.getFortune();
		mLogger.info("Back to the Main App................");
		mLogger.info("Your today's fortune : " + forturne);
		mLogger.info("Finished");
		context.close();
	}

}
