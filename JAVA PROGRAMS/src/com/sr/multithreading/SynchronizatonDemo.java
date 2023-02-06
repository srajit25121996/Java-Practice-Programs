package com.sr.multithreading;

public class SynchronizatonDemo {

	public static void main(String[] args) {
		Display d=new Display();
		MyThreadSync t1=new MyThreadSync(d, "Dhoni");
		MyThreadSync t2=new MyThreadSync(d, "YuvRaj");
		t1.start();
		t2.start();
		
		

	}
	
}
class Display{
	//synchronized method
	public  void wish(String name)  {
		//synchronized block
		int a=10;
		synchronized(this) {
		for(int i =0;i<10;i++) {
			System.out.print("Good morning : ");
			try{ 
				Thread.sleep(2000);
				}catch(InterruptedException e) {}
			System.out.println(name);
			}
		}
			
		}
	}

class MyThreadSync extends Thread{
	Display d;
	String name;
	public MyThreadSync(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}
