package com.sr.loops;

public class WhileBreakAndContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		while(number<15) {
			number++;
			System.out.println("number value in each iteration : "+number);
			if(number<=5) {
				System.out.println("Skipping number : "+number);
				continue;
			}
			System.out.println("numbers : "+number);
			
			if(number>=10) {
				System.out.println("Breaking at number : "+number);
				break;
			}
		}

	}

}
