package com.infosys.AnnotationExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Books;
import com.infosys.config.Config;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =
    		   new AnnotationConfigApplicationContext(Config.class);
       Books book = context.getBean(Books.class);
       Books childbook = context.getBean("childrenbook",Books.class);
       Books springbook =context.getBean("springbook",Books.class);
       System.out.println("children book name \t"+childbook.getBookName());
       System.out.println("spring learning book \t"+springbook.getBookName());
       System.out.println("Primary bean data \t"+book.getBookName());
    }
}
