package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
//		System.out.println("Employee class details");
//		Employee emp1 = new Employee();
//		emp1.readEmployee();
//		emp1.displayEmployee();
//		
//		System.out.println("Manager class details");
//		Manager mgr1 = new Manager();
//		mgr1.readEmployee();			// id, name,salary
//		mgr1.readManager();				// numberOfEmp
//		
//		mgr1.displayEmployee();
//		mgr1.displayManager();
		
		System.out.println("Manager details");
		Manager mgr1 = new Manager();
		mgr1.readManager();
		mgr1.displayManager();
		
		System.out.println("Developer details");
		Developer dev1 = new Developer();
		dev1.readDeveloper();
		dev1.disDeveloper();
	}

}
