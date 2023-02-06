package com.sr.multithreading;

public class ThreadRunnableDemoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Main thread");
				

	}

}
