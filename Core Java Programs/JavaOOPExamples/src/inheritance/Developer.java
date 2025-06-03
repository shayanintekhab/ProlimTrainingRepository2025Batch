package inheritance;

public class Developer extends Employee{

private String projectName;

public void readDeveloper() {
	readEmployee();
	System.out.println("Enter the project Name");
	projectName= sc.next();
}
public void disDeveloper() {
	displayEmployee();
	System.out.println("Project name is "+projectName);
}
}
