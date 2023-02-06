package com.sr.strings;

import java.util.ArrayList;

public class PrintAllConsonantAndVowelInAString {
	public static void main(String[] args) {
		String s="Its about hen";
		
		char [] ch=s.toCharArray();
		ArrayList<Character> vlist=new ArrayList<Character>();

		ArrayList<Character> clist=new ArrayList<Character>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u' ||
					ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' ||ch[i]=='U' 
					) {
				vlist.add(ch[i]);
				
			}
			else {
				if(ch[i]!=' ') 
				clist.add(ch[i]);
			}
			
		}
		System.out.print("Vowels : "+vlist);
		System.out.println();
        System.out.print("Cons :"+clist);
		
	}

}
