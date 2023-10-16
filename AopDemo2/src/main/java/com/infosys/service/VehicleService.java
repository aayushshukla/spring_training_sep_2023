package com.infosys.service;

import org.springframework.stereotype.Component;

@Component
public class VehicleService implements VehicleRepo {
	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is stopped ");
	}

	

}
