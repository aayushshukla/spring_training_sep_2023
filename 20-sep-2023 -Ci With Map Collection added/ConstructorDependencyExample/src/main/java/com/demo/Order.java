package com.demo;

import java.util.Map;
import java.util.Map.Entry;

import lombok.Data;


public class Order {
	private int orderId;
	private String orderDetails;
	private Map<String,String> orderDescp;
	public Order()
	{
		
	}
	public Order(int orderId, String orderDetails,Map<String,String> orderDescp) {
		super();
		this.orderId = orderId;
		this.orderDetails = orderDetails;
		this.orderDescp=orderDescp;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public void showOrderDescription()
	{
	  for(Map.Entry entry: orderDescp.entrySet())
	  {
		  System.out.println(entry);
	  }
		
	}
	

}
