package com.sr.basics;

public class SumOfDigit {

	
	
	public static void main(String[] args) {
		
		System.out.println("Result : "+ sumOfDigit(123));
		

	}
	// static method of sum 
	
	public static int sumOfDigit(int a) {
		
		int sum=0,rem=0;
		
		while(a>0) {
			// last digit
			rem=a%10; //Fv=5, Sv= 2, tV=1
			
			//125%10-->12*10=120, 125-120=5
			//12%10 -->1*10=10, 12-10=2
			
		
			//sum
			sum+=rem; //first value=5, second value=7, third value= 8
			//5+2=7
			// remove executed digit
			a=a/10;
			//125/10=12.5--> 12
			// if number is divide by 10 then it will give 12.5 as a result hence the number is an integer 
			//so it will only consider 12 as a result and ignore the value after decimal.
			
			
		}
		return sum;
		
	}

}
