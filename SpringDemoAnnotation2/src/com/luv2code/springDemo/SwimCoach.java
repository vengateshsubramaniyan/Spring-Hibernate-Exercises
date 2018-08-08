package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService; 
	}
	@Override
	public String getDailyWorkout() {
		return "Swin 1000 meters as warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
 
}
