package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) 
	{
		// Read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// Get the bean from spring container
		AccountDAO theAccountDAO  = context.getBean("accountDAO", AccountDAO.class);
		
		// call method to find the accounts
		List<Account> theAccounts = null;
		
		try{
			//add a boolean flag to simulate exceptions
			boolean tripWire = false;
			theAccountDAO.findAccounts(tripWire);
		}
		catch(Exception exc)
		{
			System.out.println("\n\nMain Program ... caught exception: " + exc);
		}
		// print out the accounts
		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		// close the context
		context.close();
	}

}
