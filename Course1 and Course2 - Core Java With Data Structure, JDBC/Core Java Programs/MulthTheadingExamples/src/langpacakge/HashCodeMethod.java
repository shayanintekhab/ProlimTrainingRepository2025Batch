package langpacakge;
class Employee {
		int id;
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Pre - GC");
		}
}
public class HashCodeMethod {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
			Employee emp2 = new Employee();
		Employee emp3 = emp1;
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		emp1.id=100;
			emp2.id=200;
		emp3.id=300;
		System.out.println(emp1.id);	//300
		System.out.println(emp2.id);	//200
		System.out.println(emp3.id);	//300
		emp2=null;
		Runtime.getRuntime().gc();
		System.out.println("Hello");
		System.out.println("Hi");
	}

}
