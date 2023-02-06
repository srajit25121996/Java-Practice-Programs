package com.sr.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//program to calculate a number is prime or not
//Description :- a number is prime when it is only divisible by 1 or the number it self

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		if(num<=1) 
			return false;
		else {
	         for(int i=2;i<=num-1;i++) {
	        	 if(num%i==0)
	        		 return false;
	         }
		}
	return true;	
	}
	
public static void main(String args[]) {
	//program to calculate a number is prime or not
	
	//Description :- a number is prime when it is only divisible by 1 or the number it self
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	try {
	int number=Integer.parseInt(br.readLine());
	boolean result=isPrimeNumber(number);
	System.out.println(result);
	
	
}
	catch(Exception e) {
		System.out.println(e);
		}
	}

}
