package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component("laptopbean")
public class Laptop {
	private String laptopName="HP";

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
   
	
}
