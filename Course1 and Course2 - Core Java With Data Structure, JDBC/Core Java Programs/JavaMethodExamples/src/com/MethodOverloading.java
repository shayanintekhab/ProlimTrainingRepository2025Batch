package com;

public class MethodOverloading {

	static void add() {
		System.out.println(10+20);
	}
	static void add(int x) {
		System.out.println(x+20);
	}
	static void add(int x, int y) {
		System.out.println(x+y);
	}
	static void add(float x, float y) {
		System.out.println(x+y);
	}
	static int add(float x, float y, int z) {
		System.out.println(x+y);
		return 0;
	}
	public static void main(String[] args) {
	add(10);	
	add();
	add(10.10f,10.20f);
	add(1,2);
	}

}
