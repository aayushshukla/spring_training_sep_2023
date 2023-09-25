package com.infosys.AutowiringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Person;
import com.infosys.beans.Teacher;
import com.infosys.configure.AppConfig;
import com.infosys.service.CarService;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context = 
    		   new AnnotationConfigApplicationContext(AppConfig.class);
       Person p = context.getBean(Person.class);
       p.setPersonName("Monkey");
       p.getDetails();
       System.out.println("-------------------------------------------------------");
      Teacher tobj = context.getBean(Teacher.class);
      tobj.setTeacherName("Aayush");
      tobj.getTeacherDetails();
      
      System.out.println("-------------------------------------------------------");
      CarService cs = context.getBean(CarService.class);
      cs.getCardetails();
    }
}
