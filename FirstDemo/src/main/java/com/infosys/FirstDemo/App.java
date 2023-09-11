package com.infosys.FirstDemo;

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
       // System.out.println( "Hello Class !" );
       ApplicationContext context =
    		   new ClassPathXmlApplicationContext("config.xml");
      // Return an instance, which may be shared or independent, of the specified bean.
       Employee e =  (Employee) context.getBean("emp"); 
      System.out.println(e.toString());
    }
}
