package com;

import java.util.ArrayList;

public class ListExamples {

	public static void main(String[] args) {
	// 1st Example ArrayList 
		ArrayList al = new ArrayList();
		al.add(10);	// it add at last 
		al.add(30);
		al.add(20);
		al.add(90);
		al.add(60);
		al.add("Ravi");
		al.add(30);
		System.out.println(al);
		System.out.println("Get the element using index "+al.get(1));
		al.add(1, 100);
		System.out.println(al);
		System.out.println("Get the element using index "+al.get(1));
		al.remove(2);// remove using index position 
		System.out.println(al);
		Integer value = 60;
		al.remove(value);	//by default index consider 
		System.out.println(al);
		
	}

}
