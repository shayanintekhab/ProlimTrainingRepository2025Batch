package sortexamples;

import java.util.Arrays;

public class ArraysSortExamples {

	public static void main(String[] args) {
	int num[]= {4,1,7,9,3,6,8,5};
	System.out.println("Before Sort");
	for(int n : num) {
		System.out.print(n+" ");
	}
	Arrays.sort(num);
	System.out.println();
	System.out.println("After sort");
	for(int n : num) {
		System.out.print(n+" ");
	}
	}

}
