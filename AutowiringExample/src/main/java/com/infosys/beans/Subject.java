package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private String subjectName;

	Subject()
	{
		subjectName ="Spring core";
	}
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

}
