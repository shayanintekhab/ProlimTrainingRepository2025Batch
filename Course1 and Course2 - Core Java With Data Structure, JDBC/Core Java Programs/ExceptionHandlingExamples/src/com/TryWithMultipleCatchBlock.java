package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/Integer.parseInt(args[0]);
			System.out.println("Result is "+result);
			System.out.println("no exceptoin");
		}catch(ArithmeticException e) {
			System.out.println("Arirthmetic Exception "+e);	// value must be 0
		}catch(NumberFormatException e) {
			System.out.println("Number format Exception "+e);	// any alphabets 
		}
		System.out.println("done!");
	}

}
