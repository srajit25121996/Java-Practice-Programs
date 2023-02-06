package com.sr.multithreading;

public class MyThreadJoin extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Shubham Thread");
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
