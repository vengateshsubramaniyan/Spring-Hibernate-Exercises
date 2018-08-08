package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addSillyFunction() {
		System.out.println(getClass() + ": doing some stuff");
	}
}
