package com.sr.exceptionhandling;

class Dog{
	String dogName="bazzuka";
}
public class ExceptionExampleNullPointer {

	public static void main(String[] args) {
		Dog d=null;
		try {
		System.out.println(d.dogName);
		}
	catch(NullPointerException e ) {
		Dog d1=new Dog();
		System.out.println(d1.dogName);
	}
		finally {
			System.out.println("I am finally to perform cleanUp operation.");
		}
	}

}
