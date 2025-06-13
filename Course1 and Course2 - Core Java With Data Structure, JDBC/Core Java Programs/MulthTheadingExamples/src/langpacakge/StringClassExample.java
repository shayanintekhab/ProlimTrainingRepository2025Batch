package langpacakge;

public class StringClassExample {

	public static void main(String[] args) {
		String str1 = "Welcome to Java Training";
		String str2 = new String("Welcome to Java Training");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.charAt(0));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		System.out.println(str1.indexOf('o'));
		System.out.println("------------------");
		String name1 = "Raj";		// memory created....
		String name2 =  "Raj";		// name2 assign to same memory 
		String name3 = new String("Raj");		// new memory created 
		String name4 = new String("Raj");		// new memory created 
		if(name3.equals(name4)) {
			System.out.println("Equal");
		}else {
			System.out.println("No Equal");
		}
		System.out.println("-------------------------");
		String name = "Akash Kale";
		System.out.println(name);
			System.out.println(name.toUpperCase());   
		System.out.println(name);
		
		System.out.println("----------------------------");
		StringBuffer sb  = new StringBuffer("Akash Kale");
		System.out.println(sb);
			System.out.println(sb.append(", Java Trainer"));
		System.out.println(sb);
		
		
	}

}
