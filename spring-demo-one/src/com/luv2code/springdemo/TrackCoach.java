package com.luv2code.springdemo;

public class TrackCoach implements Coach 
{
	//define a private field for the dependency
	private FortuneService fortuneService;
		
	public TrackCoach()
	{
	}
	//define a constructor for dependency
	public TrackCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	

	//override methods == implementation of Coach interface
	@Override
	public String getDailyWorkout() 
	{
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just Do It Track: " + this.fortuneService.getFortune();
	}
	
	// Add an init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	//Add a destroy method
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
