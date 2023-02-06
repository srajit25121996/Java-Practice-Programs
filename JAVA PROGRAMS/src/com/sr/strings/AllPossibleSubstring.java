package com.sr.strings;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String iString=sc.nextLine();
		List<String> aList=new ArrayList<>();
		for (int i = 0; i < iString.length(); i++) {
			for (int j = i+1; j <=iString.length(); j++) {
				System.out.println(iString.substring(i,j));
				if(iString.substring(i,j).length()==5) {
					aList.add(iString.substring(i,j));
				}
				
			}
		}
		for (String string : aList) {
			System.out.println("List : "+string);
		}

	}

}
