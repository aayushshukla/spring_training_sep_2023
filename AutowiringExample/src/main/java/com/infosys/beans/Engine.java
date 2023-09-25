package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    
	private String engineName ="V10";
        
	

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
	
	
}
