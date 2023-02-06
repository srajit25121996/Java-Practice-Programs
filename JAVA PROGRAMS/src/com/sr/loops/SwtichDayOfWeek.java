package com.sr.loops;

import java.util.Scanner;

public class SwtichDayOfWeek {

	//Using IF ELSE Method
	  
	
	//Using Switch case method 
	public static String printDayOfWeek(int day) {
		String  result="";
		
		switch(day) {
		case 0:
			result="Sunday";
			break;
		case 1:
			result="Monday";
			break;
		case 2:
			result="Tuesday";
			break;
		case 3:
			result="Wednesday";
			break;
		case 4:
			result="Thursday";
			break;
		case 5:
			result="Friday";
			break;
		case 6:
			result="Saturday";
			break;
		default:
				result="invalid input";
				break;
		}
		return result;
		
	}
	public static void main(String[] args) {
		//taking input from USER using scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Please the number of Day : \n");
		int num=sc.nextInt();
		//using Switch case.
		System.out.println(SwtichDayOfWeek.printDayOfWeek(num));
        // Using If Else
		System.out.println();
	}

}
