package com;

public class ThrowExceptionExample {

	public static void main(String[] args) {
	int age=20;

	try {
		
	
	if(age>21) {
		System.out.println("You Can Vote!");
	}else {
		//throw new Exception();		// generic exception 
		//throw new Exception("age must be > 21"); // generic exception with custom message 
		//throw new VoteException();		// custom exception class call empty constructor 
		throw new VoteException("age must be > 21");		// parameter constructor 
	}
	}catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.println("Done!");
	}

}
