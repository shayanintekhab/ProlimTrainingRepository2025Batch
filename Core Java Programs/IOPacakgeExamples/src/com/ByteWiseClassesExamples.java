package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClassesExamples {

	public static void main(String[] args) throws Exception{
		// 1st program 
		// source : keyboard destination : console or terminal 
	
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the text");
//		String msg = dis.readLine();
//		ps.println("Data is "+msg);
		
		// source : keyboard, destination : file 
		DataInputStream dis = new DataInputStream(System.in);
		//FileOutputStream fos = new FileOutputStream("abc.txt"); // override the data
		FileOutputStream fos = new FileOutputStream("abc.txt",true); // append the data 
		int ch;
		System.out.println("Enter the text");
		while((ch=dis.read()) != '\n') {
			fos.write(ch);
			System.out.print(ch+" - "+(char)ch);
		}
		fos.close();
		System.out.println("Data stored in file");
	}

}
