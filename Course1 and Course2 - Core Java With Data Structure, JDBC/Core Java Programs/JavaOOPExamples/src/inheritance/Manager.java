package inheritance;

import java.util.Scanner;

public class Manager extends Employee{
private int numberOfEmp;
Address add = new Address();
public void readManager() {
	readEmployee();     // enter id,name,salary
	System.out.println("enter the number of employee working him/her");
	numberOfEmp = sc.nextInt();	// enter nubmer of employee 
	add.readAddress();
}
public void displayManager() {
	displayEmployee();
	System.out.println("Nubmer of employee working "+numberOfEmp);
	add.displayAddress();
}
}
