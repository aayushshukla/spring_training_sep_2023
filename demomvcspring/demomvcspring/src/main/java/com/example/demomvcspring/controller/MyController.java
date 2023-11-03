package com.example.demomvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demomvcspring.model.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String homePage()
	{
		System.err.println("hello page");
		return "home";
	}
	@RequestMapping("/validate")
	public void data(Employee e)
	{
		System.err.println(e.getEname() +""+e.getEpassword());
	}
	@RequestMapping("/test")
	public ModelAndView test()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data","hello");
		return mv;
		
	}
}
