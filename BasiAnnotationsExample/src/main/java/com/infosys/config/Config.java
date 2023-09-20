package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.beans.Employee;


/*Indicates that a class declares one or more 
@Bean methods and may be processed by 
the Spring container to generate bean 
definitions and service requests */

@Configuration
public class Config {
	
	@Bean
	//Indicates that a method produces a bean to be 
	//managed by the Spring container
	Employee getEmployee()
	{
	  Employee  e  = new Employee();
	  e.setEmpId(101);
	  e.setEmpName("Suraj");
	  return e;
	  
	}
	// custom name to bean
	@Bean(name="myemployee")
	Employee getEmployee1()
	{
	  Employee  e  = new Employee();
	  e.setEmpId(102);
	  e.setEmpName("Anchal");
	  return e;
	  
	}
	@Bean(value ="infyemployee" ) // value is alias for name
	Employee getEmployee2()
	{
	  Employee  e  = new Employee();
	  e.setEmpId(103);
	  e.setEmpName("Adarsh");
	  return e;
	  
	}
	
	@Bean
	String helloClass()
	{
		return "Hello class are u enjoying beans";
	}

}
