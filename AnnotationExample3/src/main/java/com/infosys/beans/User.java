package com.infosys.beans;

import org.springframework.stereotype.Component;


// @Component is most common used annotation by developer
// Using this we can easily create and add bean to spring container 
// need less code in comparison to @bean 
// class level annotation
@Component
public class User {
	
	private String userName;
	private int   mobNo;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	
	public void show()
	{
		System.out.println("Hello show method in user");
	}

}
