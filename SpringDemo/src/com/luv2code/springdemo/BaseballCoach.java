package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on skipping";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	private void myInitMethod() {
		System.out.println("Private BaseBall Coach init method");
	}
	
	private void myDestroyMethod() {
		System.out.println("BaseBall Coach destroy method");
	}
}