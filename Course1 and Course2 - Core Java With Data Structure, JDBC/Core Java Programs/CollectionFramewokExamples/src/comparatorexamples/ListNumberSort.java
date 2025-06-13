package comparatorexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNumberSort {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2);ll.add(5);ll.add(6);ll.add(1);ll.add(8);
		System.out.println(ll);
		//Collections.sort(ll,new NumberSortAsc());
		Collections.sort(ll, new NumberSortDesc());
		System.out.println(ll);
		System.out.println("Product class objects in insertion order");
		
	}
}
