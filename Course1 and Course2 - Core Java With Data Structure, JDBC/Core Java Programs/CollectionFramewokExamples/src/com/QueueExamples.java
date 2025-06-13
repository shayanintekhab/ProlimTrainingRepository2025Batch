package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
	// Priority Queue 
		
	Queue q1 = new PriorityQueue();
	q1.add(2);q1.add(1);q1.add(4);q1.add(6);q1.add(9);q1.add(8);
	System.out.println(q1);
	System.out.println("remove value from q1 "+q1.poll());
	System.out.println(q1);
	
	System.out.println("--------------");
	Queue q2 = new LinkedList();
	q2.add(2);q2.add(1);q2.add(4);q2.add(6);q2.add(9);q2.add(8);
	System.out.println(q2);
	System.out.println("remove value from q1 "+q2.poll());
	System.out.println(q2);
	}

}
