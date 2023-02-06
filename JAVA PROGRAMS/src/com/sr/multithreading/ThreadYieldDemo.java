package com.sr.multithreading;

import java.util.Iterator;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadYield t=new MyThreadYield();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			
		}

	}

}
