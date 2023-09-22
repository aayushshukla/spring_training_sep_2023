package com.infosys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.infosys.*")
//Configures component scanning directives for use with
//@Configuration classes
//  it instructs spring on where to find the classes  marked with 
// stereotype annotation

public class Config {

}
