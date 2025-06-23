package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee stored successfully";
		}else {
			return "Employee didn't store";
		}
	}
	public String updateEmployeeSalary(Employee employee) {
		if(employeeDao.updateEmplyeeSalary(employee)>0) {
			return "Employee salary updated successfully";
		}else {
			return "Employee salary didn't update";
		}
	}
	
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmplyee(id)>0) {
			return "Employee details deleted successfully";
		}else {
			return "Employee not preset";
		}
	}
	
	public List<Employee> findAllEmployee() {
		return employeeDao.findAllEmployee();
	}
	public Employee searchEmployeeById(int id) {
		return employeeDao.findEmployee(id);
	}
}
