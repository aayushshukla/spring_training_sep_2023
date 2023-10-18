package com.infosys.jpaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.jpaexample.entity.Employee;
import com.infosys.jpaexample.repo.EmployeeRepo;

@SpringBootApplication
public class JpaexampleApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepo employeeRepo;
	public static void main(String[] args) {
		SpringApplication.run(JpaexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	 Employee e=	employeeRepo.addEmployee(new Employee("infosys","1234"));
	 System.out.println(e.toString());
	}

}
