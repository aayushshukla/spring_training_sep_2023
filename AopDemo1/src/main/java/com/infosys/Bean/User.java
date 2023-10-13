package com.infosys.Bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userName ="Infosys";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void show()
	{
		System.out.println(" Welcome user"+userName);
	}
	

}
