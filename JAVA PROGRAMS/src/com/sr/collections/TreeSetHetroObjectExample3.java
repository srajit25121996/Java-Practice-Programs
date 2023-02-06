package com.sr.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHetroObjectExample3 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("a");
		t.add("A");
		t.add("AA");
		t.add("ABC");
		t.add("XX");
		t.add("ABCD");
		//System.out.println(t);
		
		Iterator<String> i=t.iterator();
		while(i.hasNext()) {
			String s=i.next();
			System.out.println("-----"+s);
			
		}

	}

}
