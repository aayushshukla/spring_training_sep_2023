package com.infosys.jpaexample.repo;

import org.springframework.stereotype.Repository;

import com.infosys.jpaexample.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Repository
public class EmployeeRepo {

	EntityManagerFactory emf;
	
	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf)
	{
		this.emf =emf;
	}
	
   public Employee addEmployee(Employee e)
   {
	   //creating entity manager object
	 EntityManager em =   emf.createEntityManager();
	 // begin transction to make changes
	 em.getTransaction().begin();
	 em.persist(e); // to save object to entity
	 // Commit the current resource transaction, 
	 // writing any unflushed changes to the database
	 em.getTransaction().commit();
	 return e;
   }
}
