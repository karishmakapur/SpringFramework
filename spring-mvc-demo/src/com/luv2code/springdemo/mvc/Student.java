package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student 
{
	//== Private fields ==
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private String[] operatingSystems;
	
	//== Default constructor ==
	public Student()
	{
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil"); //first value is a key, second is the value user will see.
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
        favoriteLanguageOptions.put("C++", "C++");
        
	}
	
	//== Setter methods ==
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setFavoriteLanguage(String favoriteLanguage) 
	{
		this.favoriteLanguage = favoriteLanguage;
	}
	public void setOperatingSystems(String[] operatingSystems) 
	{
		this.operatingSystems = operatingSystems;
	}
	
	//== Getter methods ==
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getCountry()
	{
		return this.country;
	}
	public LinkedHashMap<String, String> getCountryOptions() 
	{
		return this.countryOptions;
	}
	public String getFavoriteLanguage() 
	{
		return this.favoriteLanguage;
	}
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() 
	{
        return this.favoriteLanguageOptions;
    }
	public String[] getOperatingSystems() 
	{
		return this.operatingSystems;
	}


}
