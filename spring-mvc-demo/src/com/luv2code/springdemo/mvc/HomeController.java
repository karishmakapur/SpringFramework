package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this is an MVC controller. Extends off of @Component.
public class HomeController 
{
	@RequestMapping("/") //map a URL request to this method.
	public String showPage() //controller method
	{
		return "main-menu"; //name of page you want to return. (view page)
	}
}
