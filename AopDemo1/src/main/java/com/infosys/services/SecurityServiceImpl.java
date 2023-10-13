package com.infosys.services;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityServiceImpl implements SecurityService {
	Logger logger =Logger.getLogger(SecurityServiceImpl.class.getName());
	@Before("execution(* com.infosys.Bean.User.show()))")
	public void validateUser() {
		// TODO Auto-generated method stub
		
		logger.info("User Validation is started");
		
	}
	@After("execution(* com.infosys.Bean.User.show()))")
	public void validationDone() {
		// TODO Auto-generated method stub
		
		logger.info("User Validation completed...User logout");
		
	}

}
