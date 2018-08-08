package com.luv2code.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>>Inside the default constructor");
	}
	
	@PostConstruct
	public void doMystartupStuff() {
		System.out.println("Inside the post construction");
	}
	
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("Inside the pre destruction");
	}
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>>Inside the Fortune Service setter method");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
