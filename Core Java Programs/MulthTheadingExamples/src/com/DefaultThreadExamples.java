package com;

public class DefaultThreadExamples {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	String name = t.getName();
	int i = t.getPriority();
	ThreadGroup tg	= t.getThreadGroup();
	System.out.println(name);
	System.out.println(i);
	System.out.println(tg);
	System.out.println(tg.getName());
	t.setName("My Thread");
	t.setPriority(1);   // min 1 and max 10
	System.out.println(t);
	//t.setPriority(11);
	t.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t);
	}

}
