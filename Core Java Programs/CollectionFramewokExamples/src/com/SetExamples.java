package com;
import java.util.*;
class A {
	@Override
	public String toString() {
		return "A class object";
	}
}
class B {
	@Override
	public String toString() {
		return "B class object";
	}
}
public class SetExamples {

	public static void main(String[] args) {
	// 1st Example with HashSet with other data types value store 	
//	HashSet hs = new HashSet();	
//	Integer a = new Integer(10);
//	hs.add(a);		//we store integer object. 
//	hs.add(20);	// auto - boxing : converting int value to Object. 
//	hs.add(10.20);
//	hs.add(true);
//	hs.add("Ravi");
//	hs.add(new A());
//	hs.add(new B());
//	System.out.println(hs);	// it display string format 
		
	// 2nd Example HashSet with all methods 
		
//		HashSet hs = new HashSet();
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		hs.add(20);
//		hs.add(10);
//		hs.add(60);
//		hs.add(40);
//		hs.add(20);
//		System.out.println(hs);
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		System.out.println("Search "+hs.contains(20));
//		System.out.println("Search "+hs.contains(200));
//		System.out.println("Remove "+hs.remove(10));
//		System.out.println("Remove "+hs.remove(100));
//		System.out.println(hs);
//		hs.clear();
//		System.out.println("Empty "+hs.isEmpty());
//		System.out.println("Size "+hs.size());
		
		//3rd Example LinkedHashSet 
		
//		LinkedHashSet hs = new LinkedHashSet();
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		hs.add(20);
//		hs.add(10);
//		hs.add(60);
//		hs.add(40);
//		hs.add(20);
//		System.out.println(hs);
//		System.out.println("Size "+hs.size());
//		System.out.println("Empty "+hs.isEmpty());
//		System.out.println("Search "+hs.contains(20));
//		System.out.println("Search "+hs.contains(200));
//		System.out.println("Remove "+hs.remove(10));
//		System.out.println("Remove "+hs.remove(100));
//		System.out.println(hs);
//		hs.clear();
//		System.out.println("Empty "+hs.isEmpty());
//		System.out.println("Size "+hs.size());
		
		// 4th Example TreeSet 
		
//		TreeSet ts = new TreeSet();
//		ts.add(2);
//		ts.add(1);
//		ts.add(9);
//		ts.add(5);
//		ts.add(4);
//		ts.add(6);
//		//ts.add(10.20);
//		System.out.println(ts);
//		System.out.println(ts.subSet(4, 6));
//		System.out.println(ts.headSet(5));
//		System.out.println(ts.tailSet(5));
		
		// 5th example 
		
		Set ss = new HashSet();
		ss.add(10);
		ss.add(20);
		ss.add(30);
		System.out.println(ss.contains(10));
	}

}
