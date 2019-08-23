package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService
{

	//create an array of String
	private String[] data = {"You have a fortune.", 
							"Today's a good day!", 
							"Tomorrow is going to be a good day!."};
	
	//random number generator
	private Random random = new Random();
	
	//implemented override methods
	@Override
	public String getFortune() 
	{
		//get a random string from the array
		int index = random.nextInt(data.length);
		return data[index];
	}

}
