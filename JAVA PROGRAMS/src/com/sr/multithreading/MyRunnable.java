package com.sr.multithreading;



interface A{
	public void addTothis() ;
}
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread");

	}

	

}
