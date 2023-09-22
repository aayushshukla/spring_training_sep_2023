package com.infosys.AnnotationExample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.Service.UserService;
import com.infosys.beans.User;
import com.infosys.config.Config;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context  = 
    		   new AnnotationConfigApplicationContext(Config.class);
       UserService u  = context.getBean(UserService.class);
       u.setUserList();
       u.getUseretList();
    }
}
