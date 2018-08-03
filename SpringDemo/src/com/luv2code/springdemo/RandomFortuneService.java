package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] arr = {"abc", "cde", "fgh"};
	private Random random = new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(arr.length);
		return arr[index];
	}
}
