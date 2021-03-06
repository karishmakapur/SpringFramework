package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //parent page 
public class StudentController
{
	@RequestMapping("/showForm") //sub page from parent page
	public String showForm(Model theModel)
	{
		// create a student object
		Student theStudent = new Student();
		
		// add student object as a model attribute to the model
		theModel.addAttribute("student", theStudent); //name,value
		
		return "student-form"; //pass it over to student-form.jsp
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		// Log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
			+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
}
