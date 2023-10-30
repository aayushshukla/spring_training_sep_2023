package com.example.mvcbasicdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Indicates that an annotated class is a "Controller" (e.g. a web controller). 
public class StudentController {
	// home method will be execute if user id going 
	// to make request for home url
	@RequestMapping("/welcome") 
	// Annotation for mapping web requests onto methods in 
	//request-handling classeswith flexible method signatures. 
	public String welcome()
	{
		System.out.println("Welcome to home page");
		return "welcome";
	}
	

}
