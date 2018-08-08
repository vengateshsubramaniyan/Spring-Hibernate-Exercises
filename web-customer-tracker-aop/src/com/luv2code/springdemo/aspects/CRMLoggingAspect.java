package com.luv2code.springdemo.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	Logger myLogger = Logger.getLogger(getClass().getName());
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forController() {}

	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forService() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDAO() {}
	
	@Pointcut("forController() || forService() || forDAO()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void beforeEnter(JoinPoint joinPoint) {
		System.out.println("==========> @Before method : " + joinPoint.getSignature().toShortString());
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("==========> @Before argument : " + arg);
		}
	}
	
	@AfterReturning(pointcut = "forAppFlow()", returning="result")
	public void beforeEnter(JoinPoint joinPoint, Object result) {
		System.out.println("==========> @After method : " + joinPoint.getSignature().toShortString());
		System.out.println("==========> @After with Result : " + result);
	}
}
