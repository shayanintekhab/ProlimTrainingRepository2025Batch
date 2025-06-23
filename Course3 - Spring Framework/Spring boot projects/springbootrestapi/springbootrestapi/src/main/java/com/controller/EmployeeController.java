package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/employee
	@RequestMapping(value = "employee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeDetails() {
		Employee emp = new Employee(100, "John", 45000);
		return emp;
	}
	
	// http://localhost:8080/employees
		@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getAllEmployeeDetails() {
			List<Employee> allEmployees = new ArrayList<Employee>();
			
			Employee emp1 = new Employee(100, "John", 45000);
			Employee emp2 = new Employee(101, "Raj", 55000);
			Employee emp3 = new Employee(102, "Ajay", 65000);
			allEmployees.add(emp1);
			allEmployees.add(emp2);
			allEmployees.add(emp3);
			return allEmployees;
		}
}
