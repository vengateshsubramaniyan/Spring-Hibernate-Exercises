package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		Account account = new Account();
		System.out.println(account);
		account.setLevel("Diamond");
		account.setName("Vengatesh");
		account.setIntLevel(10);
		accountDAO.addAccount(account, true, 20);
		accountDAO.dummy1();
		membershipDAO.addSillyFunction();
		context.close();
	}

}
