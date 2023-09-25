package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
   private String personName;
   // Marks a constructor, field, setter method, or config method as to be 
   //autowired bySpring's dependency injection facilities
   @Autowired(required = false)
   Laptop laptop;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
   
	public void getDetails()
	{
		 System.out.println("Person purchased the laptop"+personName);
		 System.out.println("Laptop model purchased :"+laptop.getLaptopName());
	
	}
}
