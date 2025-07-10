package com.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.bean.Employee;

public class EmployeeServiceTest {

	@Test
	@Ignore
	public void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployee();
		assertNotNull(emp);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(45000, emp.getSalary(),2);
		assertEquals("Developer", emp.getDesignation());
	}

	@Test
	@Ignore
	public void testStoreEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp1  = new Employee();
		String result = es.storeEmployee(emp1);
		assertEquals("Record stored", result);
	}

	@Test
	@Ignore
	public void testGetAllEmployee() {
		EmployeeService es = new EmployeeService();
		List<Employee> allEmployees = es.getAllEmployee();
		assertNotNull(allEmployees);
		assertEquals(3, allEmployees.size());
		Employee emp = allEmployees.get(0);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(45000, emp.getSalary(),2);
		assertEquals("Developer", emp.getDesignation());
	}

	@Test
	public void testUpdateEmployeeSalary() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp1 = new Employee(100, "Ravi", 45000, "Manager");
		float actualSalary = emp1.getSalary();
		Employee updatedEmployee = es.updateEmployeeSalary(emp1);
		assertEquals(actualSalary+actualSalary*0.20f, updatedEmployee.getSalary(),2);
	}

}
