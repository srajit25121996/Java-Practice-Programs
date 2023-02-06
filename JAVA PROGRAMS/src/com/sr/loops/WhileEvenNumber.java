package com.sr.loops;

public class WhileEvenNumber {
 
	public static boolean isEvenNumber(int number) {
		
		if((number%2)==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int number=4;
		int finishNumber=20;
		while(number<=finishNumber) {
			number++;
			//using the static method isEvenNumber to check whether the number is even or not 
			//this method is boolean type so it will return true or false
			if(!isEvenNumber(number)) {
				continue;
			}
			//here we are printing the number which are even
			System.out.println(number);
			count+=1;
			if(count>=5) {
				System.out.println("Total even numbers are : "+count);
				break;
			}
			
		}

	}

}
