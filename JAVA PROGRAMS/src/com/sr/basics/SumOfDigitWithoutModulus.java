package com.sr.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigitWithoutModulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String num=String.valueOf(sc.nextInt());
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for (int i = 0; i < num.length(); i++) {
			aList.add(Integer.parseInt(String.valueOf(num.charAt(i))));
		}
		System.out.println(aList);
		System.out.println(aList
		.stream()
		.reduce(0,(s1,s2)->s1+s2));
		
	}

}
