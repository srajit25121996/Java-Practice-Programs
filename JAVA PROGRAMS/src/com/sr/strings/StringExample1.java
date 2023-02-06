package com.sr.strings;

public class StringExample1 {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Shubham");

		System.out.println(sb.capacity());
		sb.append("Shubham");
		String s="Shubham";
		System.out.println(s.contentEquals(sb));
		
		System.out.println(s);
		System.out.println(sb.capacity());
	}

}
