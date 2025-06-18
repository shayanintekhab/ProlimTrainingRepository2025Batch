package com.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
	
	// Load the Driver and establish the connection 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
	
	//System.out.println("Persistence Unit loaded...");
	// creating statement or prepared statement 
	EntityManager manager = emf.createEntityManager();
	
	Product p1 = new Product();
	p1.setPid(100);
	p1.setPname("TV");
	p1.setPrice(56000);
	
	EntityTransaction tran = manager.getTransaction();
	
		tran.begin();
		manager.persist(p1);       // save or insert record. 
		tran.commit();
		System.out.println("Record saved...");
	}

}
