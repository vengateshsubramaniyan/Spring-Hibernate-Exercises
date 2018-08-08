package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Account> findAccounts(boolean stripWire) {
		
		if (stripWire) {
			throw new RuntimeException("Runtime exception from AccountDAO");
		}
		List<Account> accounts = new ArrayList<>();
		Account account = new Account("abc", "abc");
		Account account2 = new Account("cde", "cde");
		accounts.add(account);
		accounts.add(account2);
		return accounts;
	}
}
