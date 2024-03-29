package com.luv2code.springdemo;

public class BaseballCoach implements Coach
{
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	
	//override methods == implementation of Coach interface
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my fortuneService to get a fortune
		return "Just Do It Baseball: " + this.fortuneService.getFortune();
	}
}
