package com.entity;
import com.bean.Employee;

public class Developer extends Employee{

	public void displayDeveloper() {
		//System.out.println("id is "+id);		private 
		//System.out.println("name is "+name);	default outside a package. 
		System.out.println("salary is "+salary);
		System.out.println("Desgination is "+designation);
	}
}
