package com.sr.numberprograms;


public class DisariumNumber {
	
	/*
	 * Disarium number => eg.., n=175  ---------1*1+7*7+5*5*5=175
	 */
	public static long isDisariumNumber(int n) {
		long total=0,num=n,rem=0;
		while(num>0) {
			
			rem=num%10;
			int len=String.valueOf(num).length();
			total+=DisariumNumber.calculatePowerAsIndex(rem, len);
			num=num/10;
			
		}
		
		return total;
	}

	public static long calculatePowerAsIndex(long num,long position) {
		double number=num;
		double pow=position;
		 long res=Math.round(Math.pow(number, pow));
		 System.out.println("calculatePowerAsIndex : "+res);
		return res;
	}
	
	public static void main(String[] args) {
		
		int n=135;
		long result=DisariumNumber.isDisariumNumber(n);
		System.out.println(result);
		//sc.close();
		System.out.println("Shubham");

	}

}
