package com.sr.collections;

import java.util.Hashtable;

class Temp{
	private int i;
	public  Temp(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
		//return i%9;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
	
	
}
public class HashtableExampleDemo {

	public static void main(String[] args) {
		Hashtable<Temp,String> h=new Hashtable<>(25);
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		//print based on top to bottom and right to left approach
		System.out.println(h);

	}

}
