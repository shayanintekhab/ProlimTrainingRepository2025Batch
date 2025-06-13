package com.main;

//import com.college.Attendance;	// we can use only Attendance 
//import com.college.*;			// we can use all classes or interface part of college package 
//import com.school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		//Attendance att1 = new Attendance();
		//att1.display();
		
		com.school.Attendance att2 = new com.school.Attendance();
		att2.display();
		
		com.college.Attendance att1 = new com.college.Attendance();
		att1.display();
	}

}
