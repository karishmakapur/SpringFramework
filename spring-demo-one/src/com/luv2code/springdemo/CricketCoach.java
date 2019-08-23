package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// == setter methods for private field variables ==
	// setter method for emailAddress
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	// setter method for team
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// Setter method for FortuneService
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	// ==getter methods for private field variables ==
	// getter method for emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}

	// setter method for team
	public String getTeam() {
		return team;
	}

	// override methods == implementation of Coach interface
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
