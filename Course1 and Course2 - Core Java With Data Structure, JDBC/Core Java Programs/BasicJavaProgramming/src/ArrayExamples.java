
public class ArrayExamples {

	public static void main(String[] args) {
//		int a;
//		int abc[];
//		int xyz[]= {10,20,30,40,50,60,100,24,67,89,34,23,67,88,90};
//		//System.out.println(abc);
//		//System.out.println(a);
//		System.out.println(xyz);
//		System.out.println(xyz[0]);
//		System.out.println(xyz[1]);
//		System.out.println("Size of the array "+xyz.length);	// size of the array
//		System.out.println("using loop display the array value");
//		for(int i=0;i<xyz.length;i++) {
//			System.out.println(xyz[i]);
//		}
//		System.out.println("display value using enhanced loop or for each loop");
//		for(int n:xyz) {
//			System.out.println(n);
//		}
		
		// creating memory size for array 
		
		int num[]=new int[5];
		System.out.println("size of the array "+num.length);
		System.out.println(num[0]);
		System.out.println(num[4]);
		//System.out.println(num[5]);
		int temp=100;
		for(int i=0;i<num.length;i++) {
			num[i]=temp;
			temp++;
		}
		System.out.println("display array value using for loop");
		for(int n:num) {
			System.out.println(n);
		}
	}

}
