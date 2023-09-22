package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.infosys.beans.Books;

@Configuration
public class Config {
 
	
	/*
	 * Indicates that a bean should be given preference when multiple candidatesare
	 * qualified to autowire a single-valued dependency. If exactly one'primary'
	 * bean exists among the candidates, it will be the autowired value
	 */
	@Primary
	@Bean(name="childrenbook")
	public Books getBooksObject()
	{
		Books b = new Books();
		b.setBookId(101);
		b.setBookName("Harry potter");
		return b;
	}
	// get books names in app jav
	@Bean(name="springbook")
	public Books getBooksObject1()
	{
		Books b = new Books();
		b.setBookId(102);
		b.setBookName("Spring In Action");
		return b;
	}
}
