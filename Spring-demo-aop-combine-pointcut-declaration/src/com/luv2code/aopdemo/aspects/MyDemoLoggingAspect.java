package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccount() {
		System.out.println("=>>>>>>>>Inside the before AddAccount aspect");
	}
	
	@Before("forDaoPackage()")
	public void secondAspect() {
		System.out.println("=>>>>>>>>Inside the second aspect");
	}
}
