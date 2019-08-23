package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>
{

	// Define a course prefix
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		// Assign the value that is passed in from our annotation
		this.coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext ConstraintValidatorContext) 
	{
		//validation logic
		//test if the form data starts with our course prefix "LUV"
		boolean result;
		if(theCode != null)
		{
			result = theCode.startsWith(coursePrefix); 
		}
		else 
		{
			result = true;
		}
		
		//return the result.
		return result;
	}

	
}
