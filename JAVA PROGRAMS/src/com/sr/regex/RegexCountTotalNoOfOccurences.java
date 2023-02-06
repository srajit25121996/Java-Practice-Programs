package com.sr.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCountTotalNoOfOccurences {

	public static void main(String[] args) {
		
		int count=0;
		Pattern p=Pattern.compile("ab");
		String s="abbabbba";
		Matcher m=p.matcher(s);
		while(m.find()) {
			count++;
			System.out.println(m.start());
		}

		System.out.println("Total no of Occurences : "+count);
	}

}
