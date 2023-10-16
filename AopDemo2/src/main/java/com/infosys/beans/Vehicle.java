package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    

	private String vehicleName;
	
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is started");
		
	}
	
	public void stop(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
	
	public void problem()
	{
	  throw	new NullPointerException("there is some problem with engine");
	}
	
}
