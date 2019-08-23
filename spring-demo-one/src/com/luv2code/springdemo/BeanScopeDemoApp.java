package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Singleton bean = bean is shared. 
				//The objects created point to the same memory location.
public class BeanScopeDemoApp {

	public static void main(String[] args) 
	{
		// Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same bean
		boolean result = (theCoach == alphaCoach); //checking object reference. 
												//Are they pointing to the same memory?
		
		// Print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// Close the context
		context.close(); 
	}

}
