package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		System.out.println("Calling the setter methods");
		accountDAO.setField1("fields1");
		accountDAO.setField2(10);
		System.out.println("Calling the getter methods");
		accountDAO.getField1();
		accountDAO.getField2();
		
		
		accountDAO.addAccount(new Account(), true);
		accountDAO.dummy1();
		membershipDAO.addSillyFunction();
		context.close();
	}

}
