package com.infosys.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {
    Logger logger = Logger.getLogger(LoggerAspect.class.getName());
    // before is advice  when to implement 
   @Before("execution(* com.infosys.beans.Vehicle.start())")
	public void welcomeMsg() {
    
		logger.info("Thank you for purchasing this vehicle");
	}
	@After("execution (* com.infosys.beans.Vehicle.stop(..))")
	public void stopMsg()
	 {
		logger.log(Level.SEVERE," Vehicle stopped dont forget to take the keys with you");
	}
	@Around("execution(* com.infosys.beans.Vehicle.start())")
	void fuelMsg()
	{
		logger.log(Level.SEVERE,"fuel is 60%");
	}
	
	@AfterThrowing("execution(* com.infosys.beans.Vehicle.problem())")
	void errorMsg()
	{
		logger.log(Level.SEVERE,"exception code");
	}

}
