package com.sr.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++) {
			k=1;
			for(int j=1;j<=n+4;j++) {
				if(j>=6-i && j<=i+4 && k==1){
					System.out.print("*");
					k=0;
				}
				else {
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.print("\n");
		}

	}

}
