package com.sr.collections;

import java.util.ArrayList;
import java.util.List;

public class SecondMinNumberUnSortedList {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(23);  l.add(4);   l.add(14);   l.add(41);  l.add(94);   l.add(403);
        int result=SecondMinNumberUnSortedList.secondMax(l);
		System.out.println("Second minimum : "+result);
		
		
		
	}
public static int secondMax(List<Integer> l)  {
		int min;
		int secondMin=min=Integer.MAX_VALUE;
		for(int i=0;i<l.size();i++) {
			if(l.get(i)<min) {
				secondMin=min;
				min=l.get(i);
			}
			else if(l.get(i)<secondMin && l.get(i)!=min) {
				secondMin=l.get(i);
			}}
		return secondMin;
	}

}
