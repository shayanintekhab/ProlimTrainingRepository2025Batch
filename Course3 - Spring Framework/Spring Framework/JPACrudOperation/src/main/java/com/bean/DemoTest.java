package com.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
//	Product p = manager.find(Product.class, 101);
//	if(p==null) {
//		System.out.println("Record not present so didn't update");
//	}else {
//		tran.begin();
//			p.setPrice(55000);
//			manager.merge(p);		// update query 	
//		tran.commit();
//		System.out.println("Record updated");
//	}
	
	// retrieve only one record using primary key 
//	Product p = manager.find(Product.class, 102);
//	if(p==null) {
//		System.out.println("Record not present");
//	}else {
//		System.out.println(p);     // it call toString method to display output 
//	}
	
	// retrieve all records using JPQL 
	Query qry = manager.createQuery("select p from Product p");
	List<Product> listOfProduct= qry.getResultList();
	System.out.println("number of records are "+listOfProduct.size());
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	}

}
