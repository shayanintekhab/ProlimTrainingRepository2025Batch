package com.bean;

public class Manager extends Employee{

	public void displayManager() {
		//System.out.println("id is "+id);		//private 
		System.out.println("name is "+name);	//default outside a package. 
		System.out.println("salary is "+salary);
		System.out.println("Desgination is "+designation);
	}
}
