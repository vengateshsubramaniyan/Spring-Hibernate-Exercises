package com.luv2code.aopdemo.aspects;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	Logger logger = Logger.getLogger(getClass().getName());
	@Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
	public Object aroundAdviceForFortuneService(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Inside the Around Advice");
		String methodName = joinPoint.getSignature().toShortString();
		logger.info("====>Executing Method : " + methodName);
		long start = System.currentTimeMillis();
		String reString = (String) joinPoint.proceed();
		long end = System.currentTimeMillis();
		logger.info("=====>Method execution time is :" + (end-start));
		return reString;
	}
	
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFromFindAccountsAdvice(JoinPoint joinPoint) {
		String methodSignature = (String) joinPoint.getSignature().toShortString();
		logger.info("=>>>>>>>>>>>>>>>>>>>>After (finally) from the method " + methodSignature);
	}
	
	
	@AfterThrowing(
	pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
	throwing="exception")
	public void afterThrowingFromAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
		logger.info("=>>>>>>>>>>>>>>>>>>>>After Throwing Exception: " + exception);
	}
	
	@AfterReturning(
	pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
	returning = "result")
	public void afterReturningFromFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		logger.info("=>>>>>>>>>>>>>>>>>>>>After Returning from the method " + methodSignature);
		logger.info("=>>>>>>>>>>>>>>>>>>>>" + result);
		changeToUpperCase(result);
		logger.info("=>>>>>>>>>>>>>>>>>>>> After Modification: " + result);
	}

	@Before("com.luv2code.aopdemo.aspects.AopPointcutExpression.allDaoexcludingSettersAndGetters()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		logger.info("Method: " + methodSignature);
		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			logger.info((String) object);
			
			if (object instanceof Account) {
				Account account = (Account) object;
				logger.info(account.getLevel());
				logger.info(account.getName());
			}
		}
	}
	
	private void changeToUpperCase(List<Account> result) {
		for (Account account : result) {
			String uppername = account.getName().toUpperCase();
			account.setName(uppername);
		}
	}
	
}
