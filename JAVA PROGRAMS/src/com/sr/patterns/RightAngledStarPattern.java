package com.sr.patterns;

import java.util.Scanner;

public class RightAngledStarPattern {

	public static void main(String[] args) {

//please Enter the number of lines
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		
		for(int i=0;i<lines;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
