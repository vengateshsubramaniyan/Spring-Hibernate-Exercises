package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		System.out.println("Inside the getFortune function...");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Expect heavy traffic this morning...";
	}

	public String getFortune(boolean strip) {
		
		System.out.println("Inside the getFortune(boolean) function...");
		if (strip) {
			throw new RuntimeException("Runtime exception from getFortune(boolean)");
		}
		return "Expect heavy traffic this morning...";
	}
}
