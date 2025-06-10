package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveCollectionData {

	public static void main(String[] args) {
	// Retrieve for Set using loop 
	Set<Integer> ss1 = new HashSet<Integer>();
	//Set ss1 = new HashSet();
	ss1.add(2);ss1.add(3); ss1.add(6); ss1.add(8);
	System.out.println(ss1);
	System.out.println("retreive data using loop");
	for(int n : ss1) {
		System.out.println(n);
	}
	System.out.println("retrieve using iterator");
	Iterator<Integer> ii = ss1.iterator();
	while(ii.hasNext()) {
		int n = ii.next();
		//ii.remove();
		System.out.println(n);
	}
	// List Family 
	List<String> names = new ArrayList<String>();
	names.add("Ravi");names.add("Ramesh");names.add("Rajes");names.add("Lokesh");
	System.out.println(names);
	System.out.println("using loop");
	for(String name:names) {
		System.out.print(name+" ");
	}
	
	// using iterator 
	Iterator<String> ii1 = names.iterator();
	System.out.println();
			while(ii1.hasNext()) {
				String name = ii1.next();
				System.out.print(name+" --> ");
			}
	
	// using ListIterator 
	System.out.println("Retreive element - forward direction");
	ListIterator<String> ii2 = names.listIterator();
	while(ii2.hasNext()) {
		String name = ii2.next();
		System.out.print(name+"=>");
	}
	System.out.println();
	System.out.println("Retreive element - backward direction");
	while(ii2.hasPrevious()) {
		String name = ii2.previous();
		System.out.print(name+"<=");
	}
	System.err.println();
	System.out.println("Retrieve for map collection");
	Map<Integer, String> mm = new LinkedHashMap<Integer, String>();
	mm.put(2, "A");	mm.put(1, "B");	mm.put(3, "C");	mm.put(4, "D");
	Set<Integer> ss2= mm.keySet();	// store all key in set 
	Iterator<Integer> ii3 = ss2.iterator();
	while(ii3.hasNext()) {
		int key = ii3.next();
		System.out.println("Key is "+key+" Value is "+mm.get(key));
	}
}
}
