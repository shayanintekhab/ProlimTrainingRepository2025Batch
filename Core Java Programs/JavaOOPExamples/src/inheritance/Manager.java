package inheritance;

import java.util.Scanner;

public class Manager extends Employee{
private int numberOfEmp;

public void readManager() {
	System.out.println("enter the number of employee working him/her");
	numberOfEmp = sc.nextInt();
}
public void displayManager() {
	System.out.println("Nubmer of employee working "+numberOfEmp);
}
}
