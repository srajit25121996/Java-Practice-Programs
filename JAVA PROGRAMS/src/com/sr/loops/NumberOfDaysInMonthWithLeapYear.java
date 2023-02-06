package com.sr.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


	
public class NumberOfDaysInMonthWithLeapYear {
	

	public static void main(String[] args) {
		//accepting the year value from user
		// the value to calculate the should be between greater than or equal to 1 and less than or equal to 9999
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean result=true;
		try {
			int year=Integer.parseInt(br.readLine());
			if((year>=1)) {
				result=isLeapYear(year);
			System.out.println(result);
			}
			else {
				System.out.println("-1");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	//a year is a leap year when if divisible by 4 but not by 100 and also it is divisible by 400.
	
	public static boolean isLeapYear(int year) {
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				System.out.println(year);
				return true;
			}
		

		return false;
	}
	
	//method to get the number of days in month
	public static int getDaysInMonths(int year,int parameter) {
		int result=0;
		switch(parameter){
			case 1:
				result= 31;
				break;
			case 2:
				
				if(isLeapYear(year))
					result=29;
					else
						result=28;
				break;
			case 3:
				result=31;
				break;
			case 4:
				result=30;
				break;
			case 5:
				result=31;
				break;
			case 6:
			case 7:
				result=31;
				break;
			case 8:
			case 9:
				result=31;
				break;
			case 10: 
			case 11:
			case 12:
				default:
					return -1;
			
		}
		
		return -1;
		
	}

}
