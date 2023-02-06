package com.sr.multithreading.java8Lamda;

public class ThreadWithLamda {

	public static void main(String[] args) {
		/*
		 * Runnable r=()->{for(int i=0;i<5;i++) { System.out.println("Child Thread"); }
		 * System.out.println("Current Thread : "+Thread.currentThread().getName()); };
		 * Thread t=new Thread(r);
		 */
		
   Thread t=new Thread(()->{for(int i=0;i<5;i++) {
		System.out.println("Child Thread");
	}
	System.out.println("Current Thread : "+Thread.currentThread().getName());
});
	   t.start();
	   for (int i = 0; i < 5; i++) {
		System.out.println("Main Thread");
	}
	   System.out.println("Current Thread : "+Thread.currentThread().getName());
	}

}
