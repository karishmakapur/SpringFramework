package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Singleton bean = bean is shared. 
				//The objects created point to the same memory location.
public class BeanLifeCycleDemoApp {

	public static void main(String[] args) 
	{
		// Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Print to screen
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close(); 
	}

}
