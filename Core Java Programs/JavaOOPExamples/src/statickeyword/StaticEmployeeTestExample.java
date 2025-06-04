package statickeyword;
class Employee {
	int empId;	// instance variable 
	static int mgrId;	// only one copy 
	void display() {
		System.out.println("Employee id is "+empId);
		System.out.println("Manager id is "+mgrId);
	}
}
public class StaticEmployeeTestExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee();		// heap memory 
			Employee emp2 = new Employee();
				emp1.empId=100;
					emp1.mgrId=200;
						emp2.empId=300;
							emp2.mgrId=400;
								Employee.mgrId=500;
	emp1.display();		// id is 100, mgrId  = 500
	emp2.display();		// id is 300, mgrId = 500;
	}
}
