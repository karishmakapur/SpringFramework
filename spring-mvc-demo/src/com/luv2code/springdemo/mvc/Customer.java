package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Customer 
{
	//== Private Fields ==
	
	//field doesn't have any constraints
	private String firstName;
	
	//insure there is input
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	//add a range
	@NotNull(message="is required")
	@Min(value=0, message="must be > or = 0")
	@Max(value=10, message="must be < or = 10")
	private Integer freePasses;

	//insure correct data is inputed
	@Pattern(regexp="^[0-9]{5}", message="only 5 digits")
	private String postalCode;
	
	@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	
	
	//== setters and getters == 
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
}
