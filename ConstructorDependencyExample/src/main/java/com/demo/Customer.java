package com.demo;

public class Customer {
   private int customerId;
   private String custmorerName;
   private String customermai;
  // ctrl+shift+f -- formatting of code
   private Order ord;
	public Customer()
	{
		
	}

	public Customer(int customerId, String custmorerName, String customermai,Order ord) {
	
	this.customerId = customerId;
	this.custmorerName = custmorerName;
	this.customermai = customermai;
	this.ord=ord;
      }  
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustmorerName() {
		return custmorerName;
	}

	public void setCustmorerName(String custmorerName) {
		this.custmorerName = custmorerName;
	}

	public String getCustomermai() {
		return customermai;
	}

	public void setCustomermai(String customermai) {
		this.customermai = customermai;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custmorerName=" + custmorerName + ", customermai="
				+ customermai + "]";
	}

	public Order getOrder() {
		return ord;
	}

	public void setOrder(Order ord) {
		this.ord = ord;
	}
   
   
}
