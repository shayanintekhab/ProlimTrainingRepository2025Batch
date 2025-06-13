package langpacakge;
class Customer implements Cloneable{
	int cid;
	
	public Customer getClone() {
		try {
			Object obj = clone();			// clone method part of object class we can call directly 
			Customer c = (Customer)obj;			// type casting (down level ) 
			return c;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
public class CloneExamples {

	public static void main(String[] args) {
		Customer c1 = new Customer();	//new memory 
		Customer c2 = new Customer();	// new memory 
		Customer c3 =c2;				// c2 and c3 refer to same memory 
		c1.cid=1;
		c2.cid=2;
		c3.cid=3;
		// c1 = 1 and c2 and c3 = 3 
		Customer c4 = c1.getClone();
		System.out.println("After clone ");
		System.out.println(c4.cid);
		c1.cid=100;
		System.out.println("c4 object "+c4.cid);
		System.out.println("c1 object "+c1.cid);
		
	}

}
