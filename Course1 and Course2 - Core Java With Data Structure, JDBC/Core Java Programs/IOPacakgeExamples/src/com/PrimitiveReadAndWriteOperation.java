package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveReadAndWriteOperation {

	public static void main(String[] args) {
	// store primitive information in file 
//		int id = 100;
//		String name = "Ravi Kumar";
//		float salary = 34000;
//		boolean result = true;
//		try {
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(result);
//		System.out.println("Primitive data stored");
//		dos.close();
//		fos.close();
//		}catch(Exception e) {
//			System.err.println(e);
//		}
		
		// read primitive data from file system 
		
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
		fis = new FileInputStream("emp.txt");
		dis = new DataInputStream(fis);
		int id1 = dis.readInt();
		String name1 = dis.readUTF();
		float salary1 = dis.readFloat();
		boolean result1 = dis.readBoolean();
		System.out.println("id is "+id1);
		System.out.println("name is "+name1);
		System.out.println("salary is "+salary1);
		System.out.println("result is "+result1);
		
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			try {
			dis.close();
			fis.close();
			}catch(Exception e) {}
		}
		
	}

}
