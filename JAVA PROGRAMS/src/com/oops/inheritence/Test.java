package com.oops.inheritence;
/*
 * @overloading and scope of Rerence variable and object creation
 */
public class Test {
public void m1(int i) {
	System.out.println(i);
}
public void m1(float f) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.m1('c');
A a=new B();
a.m1();

	}

}
class A {
	public void m1() {
		System.out.println("Parent class");
	}
}

class B extends A{
	public void m2() {
		System.out.println("Child class");
	}
}
