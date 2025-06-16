package com.bean;

public class Employee {
private int id;
private String name;
private float salary;

	public Employee() {
		super();
		System.out.println("object created...with empty");
	}

	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created...with parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee class display method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
