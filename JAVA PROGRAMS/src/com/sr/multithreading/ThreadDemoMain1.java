package com.sr.multithreading;

public class ThreadDemoMain1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		//t.setPriority(10);
		t.start();
		//t.run();
		System.out.println(t.getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
