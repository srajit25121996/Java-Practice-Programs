package com.sr.loops;

public class ForMain {

	public static void main(String[] args) {
		// this is a simple way 
		System.out.println("10000 at 2% interest = "+calculateInterest(10000.0, 2.0));
		
		//if we want to get Interest of 2,3,4,5,6 percent upto n given numbers we will be using for loop
		//basic structure of for loop
		/*
		 * for(initialization;condition or termination;increment) {
		 * 
		 * a block of code is execute repeatedly upto given number of times until a particular condition is satisfied.
		 * 
		 * }
		 */
		
		//going front ways direction
		for(int i=2;i<9;i++) {
			System.out.println("10000 at "+i+" % interest = "+String.format("%.2f",calculateInterest(10000.0, i)));
			
		}
		
		System.out.println("**************************************");
		//going backwards direction
		for(int i=8;i>0;i--) {
			System.out.println("10000 at "+i+" % interest = "+String.format("%.2f",calculateInterest(10000.0, i)));
			
		}

	}
public static double calculateInterest(double amount,double interestRate) {
	
	return (amount *(interestRate/100));
	
}
}
