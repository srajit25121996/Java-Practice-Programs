package com.sr.areaofshapes;

import java.util.Scanner;

public class AreaOfTriangle {

	public static double areaWithBaseAndHeight(double base, double height) {
		double area=(base*height)/2;
		return area;
	}
	public static double areaWithAllSides(double a, double b,double c) {
		
		if((a+b)>c && (a+c)>b && (b+c)>a)
        {
		double s=(a+b+c)/2;
		
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
        }
		else
			return 0.0;
		
	}
	
	
	public static void main(String[] args) {
		//there are two ways to calculate area of triangle 
		//1)if we know height of triangle
		//2)if we don't know height of triangle but all the three side of triangle are known
		//:: we will be using both the the approaches
		
		
		System.out.println("Pleas select In what Way you Want to Find area of trianlge");
		System.out.println("Enter the information : ");
		System.out.println("1.Calculate using Base and Height");
		System.out.println("2.Calculate using All Three Sides");
		Scanner sc=new Scanner(System.in);
		int selection=sc.nextInt();
		switch(selection) {
		
		case 1:
			
			//Approach 1 : using formula (base*height)/2
			
			System.out.println("Enter base of trianlge : ");
            double base=sc.nextDouble();
			System.out.println("Enter height of trianlge : ");
            double height=sc.nextDouble();
            System.out.println("Area of trianlge : "+ areaWithBaseAndHeight(base,height));
            
			break;
		case 2:

			//Approach 2 : using below formula
			//only if (a+b)>c && (a+c)>b && (b+c)>a
        
			//s=(a+b+c)/2;
			
			//Square root of s(s-a)(s-b)(s-c)
			
			System.out.println("Enter first side of trianlge : ");
            double a=sc.nextDouble();
			System.out.println("Enter second side of trianlge : ");
            double b=sc.nextDouble();
            System.out.println("Enter third side of trianlge : ");
            double c=sc.nextDouble();
            System.out.println("Area of trianlge : "+ areaWithAllSides(a,b,c));
			break;
		}

	}

}
