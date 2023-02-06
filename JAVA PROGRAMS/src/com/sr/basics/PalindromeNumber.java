package com.sr.basics;


//A Palindrome number is a number which when reversed is equal to the original number 
//for eg.., 121,22122,12321,1001


public class PalindromeNumber {

	public static int getPalindrome(int num) {
		int rem=0;
		int temp=0;
		
		while(num>0) {
			rem=num%10;
			temp=temp*10+rem;
			num=num/10;
		}
		
		return  temp;
	}

	public static void main(String[] args) {
		int a=121;
	//	System.out.println("Returned number : "+getPalindrome(a));
		if(a==getPalindrome(a))
			System.out.println("the number "+ a+" is palindrome");
		else
			System.out.println("the number "+ a+"is not palindrome");
			

	}

}
