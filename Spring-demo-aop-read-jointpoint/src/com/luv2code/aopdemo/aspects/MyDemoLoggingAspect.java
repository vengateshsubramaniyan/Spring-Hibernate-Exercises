package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.luv2code.aopdemo.aspects.AopPointcutExpression.allDaoexcludingSettersAndGetters()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: " + methodSignature);
		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			System.out.println(object);
			
			if (object instanceof Account) {
				Account account = (Account) object;
				System.out.println(account.getLevel());
				System.out.println(account.getName());
			}
		}
	}
}
