package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/storeEmployee
	// method : post 
	// data : {"id":100,"name":"Ravi","salary":45000}
	
	@RequestMapping(value = "storeEmployee",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployee(emp);
	}
	
	// http://localhost:8080/findAllEmployees
	// method : get 
	
	@RequestMapping(value = "findAllEmployees",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployee();
	}
	
	
		// http://localhost:8080/updateEmployeeSalary
		// method : patch 
		// data : {"id":100,"salary":48000}
		
		@RequestMapping(value = "updateEmployeeSalary",
				method = RequestMethod.PATCH,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateEmployeeSalary(@RequestBody Employee emp) {
			return employeeService.updateEmployeeSalary(emp);
		}
		
		// http://localhost:8080/deleteEmployee/100
		// method : delete 
		
		@RequestMapping(value = "deleteEmployee/{id}",
				method = RequestMethod.DELETE)
		public String deleteEmployee(@PathVariable("id") int id) {
			return employeeService.deleteEmployee(id);
		}
		
		// http://localhost:8080/findEmployee/100
		// method : get 
				
		@RequestMapping(value = "findEmployee/{id}",
				method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee findEmployee(@PathVariable("id") int id) {
			return employeeService.searchEmployeeById(id);
		}
}
