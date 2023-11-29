package com.example.BookServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // to activate Eureka Server related configuration. 
public class BookServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceRegistryApplication.class, args);
	}

}
