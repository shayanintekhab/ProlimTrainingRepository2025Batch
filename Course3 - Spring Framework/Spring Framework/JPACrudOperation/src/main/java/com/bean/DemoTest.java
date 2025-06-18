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
	p1.setPid(102);
	p1.setPname("Laptop");
	p1.setPrice(98000);
	
	EntityTransaction tran = manager.getTransaction();
	// insert query 
//		tran.begin();
//		manager.persist(p1);       // save or insert record. 
//		tran.commit();
//		System.out.println("Record saved...");
	
	
	// Delete the Record 
	
//		Product p = manager.find(Product.class, 100);
//		if(p==null) {
//			System.out.println("Record not present so didn't delete");
//		}else {
//			tran.begin();
//				manager.remove(p);			// like delete query 
//			tran.commit();
//			System.out.println("Record deleted");
//		}
	
	// update query 
	Product p = manager.find(Product.class, 101);
	if(p==null) {
		System.out.println("Record not present so didn't update");
	}else {
		tran.begin();
			p.setPrice(55000);
			manager.merge(p);		// update query 	
		tran.commit();
		System.out.println("Record updated");
	}
	}

}
