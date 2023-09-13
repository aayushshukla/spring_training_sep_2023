package com.infosys.FirstDemo;

import java.util.List;

//POJO -Plain old java object
// it is simple java class have no restriction 
public class Employee {
  private String ename;
  private int eid;
	
  // Setter inject Dependent object 
  private Address address;
  private List<String> skillList;

public List<String> getSkillList() {
	return skillList;
}

public void setSkillList(List<String> skillList) {
	this.skillList = skillList;
}

public Employee()
  {
	  
  }
  
  public Employee(String ename, int eid) {
	this.ename = ename;
	this.eid = eid;
}
public String getEname() {
		return ename;
	}
  public void setEname(String ename) {
		this.ename = ename;
	}
 public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
   public void showAddress()
   {
	   System.out.println(address.getCityname() + address.getStatename());
	   
   }
  public void showEmployeeSkills()
  {
	  for(String skill: skillList)
	  {
		  System.out.println(skill);
	  }
	  
  }
  
}
