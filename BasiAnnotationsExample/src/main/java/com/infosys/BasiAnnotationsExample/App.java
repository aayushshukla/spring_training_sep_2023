package com.infosys.BasiAnnotationsExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Employee;
import com.infosys.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
     ApplicationContext context = 
    		 new AnnotationConfigApplicationContext(Config.class);
    // Employee emp = context.getBean(Employee.class);
    // System.out.println(emp.getEmpId()+""+emp.getEmpName());
     
    String msg=  context.getBean(String.class);
    System.out.println("string value from ioc container"+msg);
    // fist way to resolve nouniquefdefinationfound exception
    // getBean(nameofbean,datatype)
	/*
	 * Employee emp = context.getBean("getEmployee1",Employee.class);
	 * System.out.println(emp.getEmpId()+""+emp.getEmpName());
	 * 
	 * Employee emp1 = context.getBean("getEmployee2",Employee.class);
	 * System.out.println(emp1.getEmpId()+""+emp1.getEmpName());
	 */
    
    // using custom name
    System.out.println("---custom names------");
    Employee emp2 = context.getBean("myemployee",Employee.class);
    System.out.println(emp2.getEmpId()+""+emp2.getEmpName());
    
    Employee emp3 = context.getBean("infyemployee",Employee.class);
    System.out.println(emp3.getEmpId()+""+emp3.getEmpName());
    
    }
}
