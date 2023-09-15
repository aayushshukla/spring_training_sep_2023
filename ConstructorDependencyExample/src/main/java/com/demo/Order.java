package com.demo;

import lombok.Data;


public class Order {
	private int orderId;
	private String orderDetails;
	public Order()
	{
		
	}
	public Order(int orderId, String orderDetails) {
		super();
		this.orderId = orderId;
		this.orderDetails = orderDetails;
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
	
	

}
