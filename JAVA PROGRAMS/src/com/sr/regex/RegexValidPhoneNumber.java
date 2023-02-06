package com.sr.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidPhoneNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		///  assert(num.equalsIgnoreCase("hello"));
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(num);
		
		if(m.find() && m.group().equals(num)) {
			System.out.println("Valid Mobile number.");
		}
		else {
			System.out.println("Invalid Mobile number.");
		}

	}

}
