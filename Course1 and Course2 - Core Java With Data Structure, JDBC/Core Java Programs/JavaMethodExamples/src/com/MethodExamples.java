package com;

public class MethodExamples {

	// static method no passing parameter and no return type 
	static void work() {
		System.out.println("This is work method, no passing parameter no return type");
	}
	// non static no passing parameter and no return type
	void work1() {
		System.out.println("This is work method, no passing parameter no return type");
	}
	// method passing parameter and return int value. 
	int add(int x, int y){
		int sum = x+y;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		work();
		MethodExamples me = new MethodExamples();
		me.work1();
		int result = me.add(100, 200);		// call by value 
		System.out.println(result);
	}

	
}
