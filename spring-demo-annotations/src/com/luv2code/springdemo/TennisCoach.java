package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//annotation to register bean with id of default.
//name bean id by putting name in "" inside ().
@Component
//@Scope("prototype") //change the scope. default = singleton. prototype - create a new instance every time.
public class TennisCoach implements Coach 
{

	// == Private Fields ==
		//used for injection
	// == Field Injection ==
	@Autowired
	@Qualifier("randomFortuneService") //be specific when multiple implementations of interface are created.
	private FortuneService fortuneService;
	
	//== Constructors ==
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// Define my init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// Define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	// == Constructor Injection ==
	//for specific use:
		//@Autowired
		//public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService)
		//{
		//	  System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
		//	  this.fortuneService = theFortuneService;
		//}
	/*
	 @Autowired 
	 public TennisCoach(FortuneService theFortuneService) 
	 {
	 	//TennisCoach will scan for fortuneService and inject it. 
	 	this.fortuneService = theFortuneService; 
	 }
	 */
	
	// == Setter Injection ==
	/*
	@Autowired
	public void setFortuneServicce(FortuneService theFortuneService)
	{
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	*/
	
	// == Method Injection ==
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = theFortuneService;
	}
	*/
	
	// == Override Methods == Implementing Interface
	@Override
	public String getDailyWorkout() 
	{
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
