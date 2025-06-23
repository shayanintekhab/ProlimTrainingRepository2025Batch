package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeEmployee(Employee employee) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(employee);
			tran.commit();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteEmplyee(int id) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, id);
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			manager.remove(emp);
			tran.commit();
			return 1;
		}
	}
	
	public int updateEmplyeeSalary(Employee employee) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, employee.getId());
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			emp.setSalary(employee.getSalary());
			manager.merge(emp);
			tran.commit();
			return 1;
		}
	}
	
	public List<Employee> findAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select emp from Employee emp");
		return qry.getResultList();
	}
	
	public Employee findEmployee(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee emp = manager.find(Employee.class, id);
		if(emp==null) {
			return null;
		}else {
			return emp;
		}
	}
}
