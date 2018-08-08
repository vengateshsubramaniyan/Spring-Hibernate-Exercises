package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String field1;
	private int field2;
	
	public String getField1() {
		System.out.println("inside the getField1");
		return field1;
	}

	public void setField1(String field1) {
		System.out.println("Inside the setField1");
		this.field1 = field1;
	}

	public int getField2() {
		System.out.println("Inside the getField2");
		return field2;
	}

	public void setField2(int field2) {
		System.out.println("Inside the setField2");
		this.field2 = field2;
	}

	public void addAccount(Account account, boolean nothing) {
		System.out.println(getClass() + ": Doing my db work");
	}
	
	public boolean dummy1() {
		System.out.println(getClass() + ": Inside the dummy1");
		return false;
	}
}
