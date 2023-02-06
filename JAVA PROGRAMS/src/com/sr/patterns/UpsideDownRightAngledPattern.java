package com.sr.patterns;

import java.util.Scanner;

public class UpsideDownRightAngledPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		int count=1;
		
		for(int i=0;i<lines;i++) {
			for(int j=lines-1;j>=i;j--) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.print("\n");
		}
	}

}
