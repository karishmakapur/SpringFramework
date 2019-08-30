package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect 
{
	// This is where we add all of our related advice(s) for logging
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	
	@Before("forDAOPackage()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
	
	@Before("forDAOPackage()")
	public void performApiAnalytics()
	{
		System.out.println("\n=====>>>Perfoming API analytics");
		
	}
}
