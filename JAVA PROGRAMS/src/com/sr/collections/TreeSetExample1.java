package com.sr.collections;
import java.util.Comparator;
import java.util.TreeSet;
class MyComparatorExample1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	
	
}

public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>(new MyComparatorExample1());
		t.add("Shubham");
		t.add("Vishwas");
		t.add("Pravesh");
		t.add("David");
		t.add("Rohit");
		t.add("Brijesh");
		
		System.out.println(t);

	}

}
