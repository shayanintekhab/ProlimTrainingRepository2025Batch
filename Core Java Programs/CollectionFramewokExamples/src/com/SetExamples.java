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
	HashSet hs = new HashSet();	
	Integer a = new Integer(10);
	hs.add(a);		//we store integer object. 
	hs.add(20);	// auto - boxing : converting int value to Object. 
	hs.add(10.20);
	hs.add(true);
	hs.add("Ravi");
	hs.add(new A());
	hs.add(new B());
	System.out.println(hs);	// it display string format 
	}

}
