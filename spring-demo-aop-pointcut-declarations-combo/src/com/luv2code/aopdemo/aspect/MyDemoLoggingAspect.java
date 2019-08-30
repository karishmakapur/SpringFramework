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
	
	//create pointcut for getter methods
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	//create pointcut for setter methods
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	//create point: include package...exclude getter/setter
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics()
	{
		System.out.println("\n=====>>>Perfoming API analytics");
		
	}
}
