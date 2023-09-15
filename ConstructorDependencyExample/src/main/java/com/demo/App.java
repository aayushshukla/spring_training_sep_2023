package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
      ApplicationContext context =
    		  new ClassPathXmlApplicationContext("config.xml");
   // getBean() going get the object given bean and its return type is Object
      // we typecast
     Customer customer=  (Customer) context.getBean("cust");
     System.out.println(customer.getCustomerId());
     System.out.println(customer.getCustmorerName());
     System.out.println(customer.getCustomermai());
     System.out.println(customer.getOrder().getOrderDetails());
     // ctrl+shift+?
		/*
		 * Order obj = (Order) context.getBean("ordid");
		 * System.out.println(obj.getOrderId());
		 * System.out.println(obj.getOrderDetails())
		 */;
    
    }
}
