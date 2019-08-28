package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect 
{
	// This is where we add all of our related advice(s) for logging
	
	// Let's start with a @Before advice
	//com.luv2code.aopdemo.dao.AccountDAO.addAccount() -- for a specific class
	//addAccount() for all add accounts
	//add*() for any method that starts with add*
	//@Before("execution(public void add*())")
	//@Before("execution(* add*())") -- any return type
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
}
