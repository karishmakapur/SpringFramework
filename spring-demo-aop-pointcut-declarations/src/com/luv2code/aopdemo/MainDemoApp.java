package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) 
	{
		// Read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// Get the bean from spring container
		AccountDAO theAccountDAO  = context.getBean
				("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean
				("membershipDAO", MembershipDAO.class);
		
		// call the business method 
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		//call the method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		// close the context
		context.close();
	}

}
