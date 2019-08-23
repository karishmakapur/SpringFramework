package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)//helper class that contains business rules/ validation logic
@Target({ ElementType.METHOD, ElementType.FIELD }) //can apply our annotation to a method or field
@Retention(RetentionPolicy.RUNTIME) //retain this annotation in the Java Class File
public @interface CourseCode 
{

	// Define default course code
	public String value() default "LUV";
	
	// Define default error message
	public String message() default "must start with LUV";
	
	// Define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}
