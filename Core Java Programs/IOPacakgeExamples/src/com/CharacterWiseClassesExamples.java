package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseClassesExamples {

	public static void main(String[] args) throws Exception{
	// 1st 
	// Source : Keyboard, Destination : Console 
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the id");
//		int id = Integer.parseInt(br.readLine());
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("Enter the salary");
//		float salary = Float.parseFloat(br.readLine());
//		System.out.println("id is "+id);
//		System.out.println("name is "+name);
//		System.out.println("salary is "+salary);
		
		// 2nd program 
		// source : file destination : file 
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("sample.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied");

	}

}
