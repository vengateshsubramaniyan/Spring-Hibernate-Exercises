package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.luv2code.aopdemo.aspects.AopPointcutExpression.allDaoexcludingSettersAndGetters()")
	public void beforeAddAccount() {
		System.out.println("=>>>>>>>>Inside the before AddAccount aspect");
	}
}
