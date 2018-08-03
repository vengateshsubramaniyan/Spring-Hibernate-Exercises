package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Setter for Email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setter for Team");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method of the FortuneService");
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {
		System.out.println("Inside the CricketCoach Class");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do the net practice for 30 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
