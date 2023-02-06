package com.sr.multithreading;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin t=new MyThreadJoin();
		t.start();
		//t.join();//without time period
		t.join(10000,700);//with time period
for (int i = 0; i < 10; i++) {
	System.out.println("Kt Thread");
}
	}

}
