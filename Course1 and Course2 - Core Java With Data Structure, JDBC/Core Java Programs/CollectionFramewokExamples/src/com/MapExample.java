package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
	// HashMap, LinkedHashMap
	//Map mm = new HashMap();
	//Map mm = new LinkedHashMap();
	//Map mm = new TreeMap();
	Map mm = new Hashtable();
	mm.put(2, "Ravi");
	mm.put(1, "Ramesh");
	mm.put(4, "Rajesh");
	mm.put("a","b");
	mm.put(3, "Ram");
	System.out.println(mm);
	System.out.println(mm.get(1));
	System.out.println(mm.get(5));
	System.out.println("contains value "+mm.containsKey(2));
	System.out.println("contains value "+mm.containsValue("Ajay"));
		mm.put(1,"Ajay");	// if present value get replace 
	mm.put(6, "Ravi");
	System.out.println(mm);
	}

}
