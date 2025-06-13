package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection framework without generics 
//	List ll = new ArrayList();
//	ll.add(10);
//	ll.add(10.20);
//	ll.add("Ravi");
//	ll.add(true);
//	
//	Object obj  = ll.get(1);
//	if(obj instanceof Integer) {
//		Integer i = (Integer)obj;
//		int n = i.intValue();
//		System.out.println(n);
//	}else {
//		System.out.println("Different type of value ");
//	}
		
	// Collection framework with Generics
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);			// auto-boxing 
		ll.add(20);
		//ll.add(20.20);
		ll.add(40);
		
		int n = ll.get(0);   	// auto-unboxing 
		System.out.println(n);
		
		List<Object> ll1= new ArrayList<Object>();
		ll1.add(10);
		ll1.add(10.20);
		ll1.add("Ravi");
		ll1.add(true);
		
		Object obj = ll.get(1);
		if(obj instanceof Double) {
			Double dd = (Double)obj;
			double dd1 = dd;
			System.out.println(dd1);
		}
	}

}
