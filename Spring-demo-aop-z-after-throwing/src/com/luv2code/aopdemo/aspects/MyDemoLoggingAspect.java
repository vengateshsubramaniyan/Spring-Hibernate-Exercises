package com.luv2code.aopdemo.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	
	@AfterThrowing(
	pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
	throwing="exception")
	public void afterThrowingFromAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
		System.out.println("=>>>>>>>>>>>>>>>>>>>>After Throwing Exception: " + exception);
	}
	
	@AfterReturning(
	pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
	returning = "result")
	public void afterReturningFromFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("=>>>>>>>>>>>>>>>>>>>>After Returning from the method " + methodSignature);
		System.out.println("=>>>>>>>>>>>>>>>>>>>>" + result);
		changeToUpperCase(result);
		System.out.println("=>>>>>>>>>>>>>>>>>>>> After Modification: " + result);
	}
	
	
	private void changeToUpperCase(List<Account> result) {
		for (Account account : result) {
			String uppername = account.getName().toUpperCase();
			account.setName(uppername);
		}
	}


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
