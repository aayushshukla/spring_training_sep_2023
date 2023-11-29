package com.demo.BookApiGatewayExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookApiGatewayExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiGatewayExampleApplication.class, args);
	}

}
