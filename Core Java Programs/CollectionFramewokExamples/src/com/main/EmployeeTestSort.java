package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bean.Employee;

public class EmployeeTestSort {

	public static void main(String[] args) {
	List<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(2, "Ajay", 34000));
	listOfEmp.add(new Employee(1, "Vijay", 44000));
	listOfEmp.add(new Employee(3, "Dinesh", 54000));
	System.out.println("Employee details in insertion order");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	//List<Integer> ll1 = new ArrayList<Integer>();
	Collections.sort(listOfEmp);// list of any type and that type must be implement Comparable interface. 
	System.out.println();
	System.out.println("Employee details After sort");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	}

}
