package com.bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	System.out.println(this.id+" "+o.id);
	//return this.id-o.id;			// it return +ve, -ve or 0;// id by sort asc 
	//return o.id-this.id;			// id by sort desc 
	//return this.name.compareTo(o.name);		// name asc 
	//return o.name.compareTo(this.name);		// name desc 
	//return (int)(this.salary-o.salary);			// it return +ve, -ve or 0;// name by sort asc 
	return (int)(o.salary-this.salary);			// it return +ve, -ve or 0;// name by sort asc 
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
