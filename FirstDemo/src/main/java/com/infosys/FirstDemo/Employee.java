package com.infosys.FirstDemo;
//POJO -Plain old java object
// it is simple java class have no restriction 
public class Employee {
  private String ename;
  private int eid;
	
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

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
  
	
  
}
