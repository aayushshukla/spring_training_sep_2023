package com.infosys.service;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo {
	public void start();
	public void stop();

}
