package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> accounts = null;
		try {
			boolean stripWire = true;
			accounts = accountDAO.findAccounts(stripWire);
		} catch (Exception e) {
			System.out.println("Main program Caught Exception: " + e);
		}
		System.out.println("After returning.......");
		System.out.println(accounts);
		context.close();
	}

}
