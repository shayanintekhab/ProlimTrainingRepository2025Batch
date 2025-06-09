package langpacakge;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {
	int a=10;
	Integer b = new Integer(a);	// converting primitive to object 
	Integer c = a;		// converting primitive to object with help of auto -boxing concept. 
	Integer d = 100;

	int e = d;	// auto-unboxing : converting object to primitive 
	}

}
