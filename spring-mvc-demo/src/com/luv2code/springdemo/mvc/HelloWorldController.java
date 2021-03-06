package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //spring mvc controller
@RequestMapping("/hello")//parent mapping: high level mapping
public class HelloWorldController 
{
	// Need a controller method to show the initial HTML form
	// main page name/parent mapping (if there is one)/showForm: 
	//sub mapping: relative to hello
	@RequestMapping("/showForm") 
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// Need a controller method to read form data from
	// and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//Read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		//name, value
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	// Need a controller method to read form data from and add data to the model
	@RequestMapping("/processFormVersionThree")
	// spring will read param from request: studentName and 
	//bind it to the variable theName
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) 
	{
		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hey my friend from v3! " + theName;

		// add message to the model
		// name, value
		model.addAttribute("message", result);

		return "helloworld";
	}
	
}
