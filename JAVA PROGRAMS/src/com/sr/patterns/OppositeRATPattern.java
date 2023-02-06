package com.sr.patterns;

import java.util.Scanner;

public class OppositeRATPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=lines;j++) {
				
				if(j>=(lines+1)-i){
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
