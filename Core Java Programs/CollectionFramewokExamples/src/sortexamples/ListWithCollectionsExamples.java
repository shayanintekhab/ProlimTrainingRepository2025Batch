package sortexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWithCollectionsExamples {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(3);ll.add(1);ll.add(5);ll.add(9);ll.add(6);ll.add(2);ll.add(7);
		System.out.println("Unsorted elements or data");
		for(int n: ll) {
			System.out.print(n+" ");
		}
		Collections.sort(ll);
		System.out.println();
		System.out.println("After sort - Asc order");
		for(int n: ll) {
			System.out.print(n+" ");
		}
		System.out.println();
		Collections.reverse(ll);
		System.out.println("After sort - Desc order");
		for(int n: ll) {
			System.out.print(n+" ");
		}
	}

}
