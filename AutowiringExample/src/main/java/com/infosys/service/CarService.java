package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infosys.beans.Engine;
import com.infosys.beans.Transmission;

@Service  // Indicates that an annotated class is a "Service",
public class CarService {
	Engine engine;
	Transmission transmission;
	@Autowired // autowired the constructor
	public CarService(Engine engine, Transmission transmission) {
		
		this.engine = engine;
		this.transmission = transmission;
	}
	
	public void getCardetails()
	{
		System.out.println(" Engine name is  "+engine.getEngineName());
		System.out.println(" Tranmission is :"+transmission.getPower());
	}
	
	

}
