package com;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) throws Exception{
	File ff = new File("D:\\Desktop\\Prolim Java Full Stack Training\\Stack solutions.txt");
	System.out.println(ff.getAbsolutePath());
	System.out.println(ff.isDirectory());
	System.out.println(ff.isFile());
	System.out.println(ff.canRead());
	System.out.println(ff.canWrite());
	System.out.println(ff.canExecute());
	System.out.println(ff.length());
	
	
	}

}
