package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency
	public BasketballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}

	// override methods == implementation of Coach interface
	@Override
	public String getDailyWorkout() {
		return "Do 100 free throws";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It Basketball: " + this.fortuneService.getFortune();
	}

}
