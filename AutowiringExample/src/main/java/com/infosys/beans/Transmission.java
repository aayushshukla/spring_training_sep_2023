package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
public class Transmission {
	int power = 100;


	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	

}
