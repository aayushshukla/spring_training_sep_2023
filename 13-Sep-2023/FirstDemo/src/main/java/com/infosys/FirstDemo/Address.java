package com.infosys.FirstDemo;

import lombok.Data;
// lombok is automatic resource generator
// it will automatically generate getter -setter
// hash code , to string 

@Data
public class Address {
	private String cityname;
	private String statename;

}
