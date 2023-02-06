package com.sr.patterns;

import java.util.Scanner;

public class Pattern5 {

	/*
	*    
   ***   
  *****  
 ******* 
********* 
 
	 * */
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=lines+4;j++) {
				
				if(j>=6-i && j<=i+4){
					System.out.print("*");
				}				
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}


	}

}
