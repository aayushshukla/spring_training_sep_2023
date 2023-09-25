package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	private String teacherName;
	
	Subject subject;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Subject getSubject() {
		return subject;
	}
    @Autowired   // autowiring setter method
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
    public void getTeacherDetails()
    {
        System.out.println("teacher name is "+teacherName);
    	System.out.println(subject.getSubjectName());
    }
	

}
