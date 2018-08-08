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
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getters() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setters() {}
	
	@Pointcut("forDaoPackage() && !(getters() || setters())")
	private void allDaoexcludingSettersAndGetters() {}
	
	@Before("allDaoexcludingSettersAndGetters()")
	public void beforeAddAccount() {
		System.out.println("=>>>>>>>>Inside the before AddAccount aspect");
	}
	
	@Before("forDaoPackage() && !(getters() || setters())")
	public void secondAspect() {
		System.out.println("=>>>>>>>>Inside the second aspect");
	}
}
