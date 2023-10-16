package com.infosys.AopDemo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.infosys.*") // (basepackages={"com.p1.xyz","com.p2.abc"})
@EnableAspectJAutoProxy
public class AppConfig {

	
}
