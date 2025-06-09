package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
	// 1st Example ArrayList 
//		ArrayList al = new ArrayList();
//		al.add(10);	// it add at last 
//		al.add(30);
//		al.add(20);
//		al.add(90);
//		al.add(60);
//		al.add("Ravi");
//		al.add(30);
//		System.out.println(al);
//		System.out.println("Get the element using index "+al.get(1));
//		al.add(1, 100);
//		System.out.println(al);
//		System.out.println("Get the element using index "+al.get(1));
//		al.remove(2);// remove using index position 
//		System.out.println(al);
//		Integer value = 60;
//		al.remove(value);	//by default index consider 
//		System.out.println(al);
		
		// 2nd Example LinkedList 
		
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//			ll.add(30);
//			
//		ll.add(60);
//		ll.add(40);
//		System.out.println(ll);
//		ll.add(2, 100);
//		System.out.println(ll);
//		ll.remove(1);
//		System.out.println(ll);
//		ll.addFirst(111);
//		ll.addLast(222);
//		System.out.println(ll);
		
		// 3rd example using Vector class 
		
//		Vector vv = new Vector();
//		vv.add(100);
//		vv.add(200);
//		vv.add(300);
//		vv.add("Ravi");
//		System.out.println(vv);
		
		// Stack Operation 
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("Pop Operation "+ss.pop());	// display as well as remove from stack 
		System.out.println(ss);
		System.out.println("Peek operation "+ss.peek());	// display top most element 
		System.out.println(ss);
		System.out.println("Search operation "+ss.search(200));
		System.out.println("Search operation "+ss.search(100));
		System.out.println("Search operation "+ss.search(10000));
		System.out.println("size "+ss.size());
	}

}
