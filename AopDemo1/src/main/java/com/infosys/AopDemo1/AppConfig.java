package com.infosys.AopDemo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.infosys.*")
@EnableAspectJAutoProxy  
// Enables support for handling components marked with AspectJ's 
// @Aspect annotation,similar to functionality found
public class AppConfig {

	

}
