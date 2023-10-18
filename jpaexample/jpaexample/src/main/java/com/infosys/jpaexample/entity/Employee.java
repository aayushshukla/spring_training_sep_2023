package com.infosys.jpaexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//Specifies that the class is an entity. 
//This annotation is applied to the entity class.
@Table(name="emptable")
public class Employee {
	@Id // primary key
	@GeneratedValue
	private int empId;
	@Column(name = "employeename")
	private String empName;
	private String empPassword;
	
	public Employee()
	{
		
	}
	public Employee(String empName, String empPassword) {
		super();
		this.empName = empName;
		this.empPassword = empPassword;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPassword=" + empPassword + "]";
	}
	
	

}
