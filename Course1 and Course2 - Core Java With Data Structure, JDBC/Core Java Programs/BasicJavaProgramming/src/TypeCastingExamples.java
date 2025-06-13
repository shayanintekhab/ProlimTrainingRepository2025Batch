
public class TypeCastingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte a=10;
//		short b=a;		// implicit type casting 
//		System.out.println(a);
//		System.out.println(b);
//		
//		short c=10;
//		//byte d=c;			byte d = (type)c
//		byte d = (byte)c;			// explicit type casting 
//		System.out.println(c);
//		System.out.println(d);
//		
//		int m=100;
//		float n=m;		// implicit type casting 
//		System.out.println(m);
//		System.out.println(n);
//		//float o=(float)100.0;
//		float o= 100.0f;		// explicit type casting converting double to float 
//		int p = (int)o;		// explicit type casting 
//		System.out.println(o);
//		System.out.println(p);
		
//		byte a=10;		// -128 to 127 
//		short b=a;
//		System.out.println("a "+a);
//		System.out.println("b "+b);
//		
//		short c=129;
//		byte d = (byte)c;
//		System.out.println("c "+c);
//		System.out.println("d "+d);
		
		char ch='A';
		System.out.println(ch);
		int ch1 = ch;		// converting char to int is implicit type casting
		

		System.out.println(ch1);
		
		int ch2 = 97;
		System.out.println(ch2);
		char ch3 = (char)ch2;
		System.out.println(ch3);     // implicit type casting 
		String name = "akash";
		
		char nameInArray[]=name.toCharArray();  // converting string to character array 
		
		char nameChar1 = nameInArray[0];	// hold 0 index position in nameChar1
		char nameChar2 = nameInArray[1];	// hold 1 index position in nameChar2
		System.out.println(nameChar1);
		System.out.println(nameChar2);
	}

}
