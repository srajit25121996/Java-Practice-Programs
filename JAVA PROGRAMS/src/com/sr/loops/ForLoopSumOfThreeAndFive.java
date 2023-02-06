package com.sr.loops;

public class ForLoopSumOfThreeAndFive {

	public static void main(String[] args) {
		// Question--Sum 3 and 5 Challenge
		
		/*
		 * Create a for Statement using a range of number from 1 to 1000 inclusive
		 * Sum all the number that can be divided by 3 and also with 5
		 * for those numbers that met the above condition print the number
		 * break out the loop once you fine first 5 number that met the above condition
		 * After breaking the loop print Sum of the numbers that met the above condition
		 * */
		int sum=0,count=0;
		
		for(int i=1;i<=1000;i++) {
			if((i%3==0)&&(i%5==0)) {
				sum+=i;
				System.out.println(i);
				count++;
			}
			if(count==5) {
				
				break;
			} 
		}
		
		System.out.println("Sum = "+sum);
	}

}
