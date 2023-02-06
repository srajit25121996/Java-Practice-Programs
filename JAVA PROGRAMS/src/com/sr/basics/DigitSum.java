 package com.sr.basics;

public class DigitSum {
	
	public static void main(String[] args) {
		/*Write a method name digitSum that has one int parameter called number
		 * If parameter >=10 then the method should process the number and return the sum of all digit of number, 
		 * other wise return -1
		 * The numbers from0-9 have one digit so we dont't want to process them, 
		 * also we don't want to process negative numbers, so return -1 for negative number.
		 * 
		 * for example:- calling the metod sumDigit(125) should return 8 since 1+2+5=8.
		 */ 
		int number=125; // you also take input from keyboard to make it simple i have taken hard-coded use Scanner or BufferedReader to take input from keyboard. 
		if(number<10)
			System.out.println("-1");
		else
		System.out.println(sumDigit(number));
	}
	private static int sumDigit(int number) {
		int sum=0;
		int rem=0;
		//Explanation
		//12*10=120 from we can get last digit as 5 and futher we will be adding it to sum
		//125/10=12.5 since the number is integer it will take 12 for second iteration
		while(number>0) {
			//extract least signification digit
			rem=number%10;
			sum+=rem;
			//drop least significant digit
			number=number/10;
		
		}
		return sum;
	}


}
