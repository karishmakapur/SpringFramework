package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolfConfig 
{

	@Bean 
	public FortuneService restFortuneService()
	{
		return new RESTFortuneService();
	}
	
	@Bean
	public Coach golfCoach()
	{
		return new GolfCoach(restFortuneService());
	}

}
