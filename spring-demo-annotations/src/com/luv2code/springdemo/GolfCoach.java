package com.luv2code.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService; 
	
	
	public GolfCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Putter Putter up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
