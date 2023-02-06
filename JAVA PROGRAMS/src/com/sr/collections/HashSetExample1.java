package com.sr.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Shubham");
		a.add("Shubham");
		a.add("Rajit");
		a.add("Rajit");
		HashSet<String> h=new HashSet<String>(a);
		/*
		 * h.add(null); h.add("SHubham"); h.add(null);
		 */
        System.out.println(h);
        h.size();
	}

	
}
