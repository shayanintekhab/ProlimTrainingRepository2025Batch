package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	
	public Employee getEmployee() {
		Employee emp1 = new Employee(100, "Ravi", 45000, "Developer");
		return emp1;
	}
	
	public String storeEmployee(Employee emp) {
		// logic;
		return "Record stored";
	}
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp =new ArrayList<Employee>();
		listOfEmp.add(new Employee(100, "Ravi", 45000, "Developer"));
		listOfEmp.add(new Employee(101, "Raj", 55000, "Manager"));
		listOfEmp.add(new Employee(102, "Raju", 35000, "Tester"));
		return listOfEmp;
	}
	public Employee updateEmployeeSalary(Employee emp) {
			if(emp.getDesignation().equals("Manager")) {
				emp.setSalary(emp.getSalary()+emp.getSalary()*.20f);
			}else if(emp.getDesignation().equals("Developer")){
				emp.setSalary(emp.getSalary()+emp.getSalary()*.10f);
			}else {
				emp.setSalary(emp.getSalary()+emp.getSalary()*.05f);
			}
			return emp;
	}
}
