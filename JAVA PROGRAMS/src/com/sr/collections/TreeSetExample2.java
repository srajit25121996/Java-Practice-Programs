package com.sr.collections;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeTreeSet2 implements Comparable<Object>{
	
	private int id;
	String name;
	private int age;
	
	public EmployeeTreeSet2(int id,String name,int age) {
	this.id=id;
	this.name=name;
	this.age=age;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : "+this.id+" Name : "+this.name+" Age : "+this.age;
	}

	@Override
	public int compareTo(Object o) {
		int id1=this.id;
		EmployeeTreeSet2 et1=(EmployeeTreeSet2)o;
		int id2=et1.id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return 1;
		else
			return 0;
	}
	
}

class MyComparator2 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		EmployeeTreeSet2 em1=(EmployeeTreeSet2)o1;
		EmployeeTreeSet2 em2=(EmployeeTreeSet2)o2;
		String s1=em1.name;
		String s2=em2.name;
		return s1.compareTo(s2);
	}
	
}
public class TreeSetExample2 {

	public static void main(String[] args) {
		EmployeeTreeSet2 e1=new EmployeeTreeSet2(81, "Shubham",24 );
		EmployeeTreeSet2 e2=new EmployeeTreeSet2(43, "Brijesh",23 );
		EmployeeTreeSet2 e3=new EmployeeTreeSet2(19, "David",22 );
		EmployeeTreeSet2 e4=new EmployeeTreeSet2(56, "Pravesh",26 );
		EmployeeTreeSet2 e5=new EmployeeTreeSet2(02, "Rohit",29);
		
		System.out.println("Sorting based on Default natural sorting order on Id :");
		TreeSet<EmployeeTreeSet2> t=new TreeSet<EmployeeTreeSet2>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		//System.out.println(t);
		
		for (EmployeeTreeSet2 et : t) {
			System.out.println(et);
		}
		
		System.out.println("Sorting based on reverse alphabetical order on Name :");
		
		TreeSet<EmployeeTreeSet2> t1=new TreeSet<EmployeeTreeSet2>(new MyComparator2());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		for (EmployeeTreeSet2 et1 : t1) {
			System.out.println(et1);
		}
	}

}
