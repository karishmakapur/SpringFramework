package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService 
{

	private String fileName = "C:/Users/karis/eclipse-workspace/spring-demo-annotations/src/com/luv2code/springdemo/Fortunes";
	private String fortunes[] = new String[5];
	
	Random myRandom = new Random();
	
	@PostConstruct
	public void readFile()
	{
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		try(BufferedReader br = new BufferedReader(new FileReader(theFile)))
		{
			String tempLine;
			int index = 0;
			
			while((tempLine = br.readLine()) != null)
			{
				fortunes[index] = tempLine;
				index++;
			}


		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() 
	{
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
