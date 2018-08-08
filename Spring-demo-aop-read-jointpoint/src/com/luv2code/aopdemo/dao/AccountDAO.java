package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account, boolean nothing, Integer leveInt) {
		System.out.println(getClass() + ": Doing my db work");
	}
	
	public boolean dummy1() {
		System.out.println(getClass() + ": Inside the dummy1");
		return false;
	}
}
