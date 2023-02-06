package com.sr.loops;

import java.util.Scanner;

public class SwitchNumberInWord {
	public static String printNumberToWords(int n) {
		String result="";
		switch(n) {
		
		case 0:
		    result="Zero";
			break;
		case 1:
			result="One";
			break;
		case 2:
		    result="Two";
			break;
		case 3:
			result="Three";
			break;
		case 4:
			result="Four";
			break;
		case 5:
			result="Five";
			break;
		case 6:
		    result="Six";
			break;
		case 7:
			result="Seven";
			break;
		case 8:
			result="Eight";
			break;
		case 9:
			result="Nine";
			break;
		default:
			System.out.println("Invalid Number.");
				
		}
		return result;
	}

	public static void main(String[] args) {
		// Using swtich to get a single digit number into words 0-9
		
		//taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleaste enter a number : ");
		int num=sc.nextInt();
		System.out.println(printNumberToWords(num));
		
		

	}

}
