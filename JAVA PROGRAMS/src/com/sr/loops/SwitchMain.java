package com.sr.loops;

public class SwitchMain {

	public static void main(String[] args) {
		// Switch is good to use when you are testing or checking things on one variable
		
		//where as if more flexible in comparison to switch case
		
		//below we are comparing if to Switch
		
		int a=1;
		if(a==1)
			System.out.println("value is one. ");
		else if(a==2)
			System.out.println("Value is 2.");
		else
			System.out.println("Value is niether 1 nor 2.");
		
		
		int b=7;
		switch(b) {
		case 1:
			System.out.println("Switch Value is 1.");
			break; //it is necessary to put a break statement at end of every case 
			//other wise it will give u unconditional results
			//if you don't put it will execute the cases until it does not finds the next break or till end of switch case.
		case 2:
			System.out.println("Switch Value is 2.");
			break;
		case 3:case 4:case 5:
			System.out.println("Switch Value is 3 or 4 or 5.");
			break;
		case 6:
		    System.out.println("Switch Value is 6.");
		    break;
		    default:
		    	System.out.println("Switch Value doesn't exist");
		    	break;
		    	
		
		}
		
		//#1. Challenge 
		//create a new switch statement using char instead of int
		//create a new char variable 
		//create a switch statement testing for A,B,C,D or 
		//display a message of any of these are found and then break
		//add a default which displays a message saying not found
		
		
		
		
		char letter='B';
		switch(letter) {
		
		case 'A':
			System.out.println("Switch is A.");
			break;
		case 'B':
			System.out.println("Swicth Value is B");
			break;
		case 'C':
			System.out.println("Switch Value is C");
			break;
		case 'D':
			System.out.println("Switch Value is D");
			break;
		case 'E':
			System.out.println("Switch Value is E");
			break;
			default:
		System.out.println("Not Found");
		break;
		
		
		}
		
		
		String month="January";
		switch(month) {
		
		}
		
	}

}
