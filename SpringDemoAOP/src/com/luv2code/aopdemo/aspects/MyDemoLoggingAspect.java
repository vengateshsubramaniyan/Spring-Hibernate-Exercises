package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccount() {
		System.out.println("=>>>>>>>>Inside the before AddAccount aspect");
	}
}
