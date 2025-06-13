package langpacakge;

public class WrapperClassExample {

	public static void main(String[] args) {
	int a=10;		// primitive data type with value as 10
	Integer b = new Integer(a);	// converting primitive to object and b value is 10
	int c = b.intValue();		// converting object to int primitive 
	float d = b.floatValue();	// converting object to float primitive 
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	// converting String to integer and vice-versa 
	String s1 = "10";
	String s2 = "20";
	System.out.println(s1+s2);
	int s3 = Integer.parseInt(s1);	// converting string to int 
	int s4 = Integer.parseInt(s2);
	System.out.println(s3+s4);
	String s5  = String.valueOf(s3);	// converting primitive to String object. 
	String s6 = String.valueOf(s4);
	System.out.println(s5+s6);
	}

}
