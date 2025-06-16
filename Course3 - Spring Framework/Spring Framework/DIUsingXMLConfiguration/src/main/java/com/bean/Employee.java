package com.bean;

public class Employee {
private int id;
private String name;
private float salary;

	public Employee() {
		super();
		System.out.println("object created...");
	}

	public void display() {
		System.out.println("Employee class display method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
