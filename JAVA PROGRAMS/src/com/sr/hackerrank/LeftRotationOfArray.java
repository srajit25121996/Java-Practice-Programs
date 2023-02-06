package com.sr.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int d=4;
		int bitShift=0;
		for(int i=0;i<d;i++){
			//System.out.println("Outer For Loop:");
			bitShift=list.get(0);
	       
	        for(int j=0;j<list.size()-1;j++){
	        	//System.out.println("Inner For Loop:");
	        	 list.set(j, list.get(j+1)) ; 
	        	 
	        }
	        
	        list.set(list.size()-1, bitShift);
	        System.out.println(list);
	    }
		//System.out.println(list);
		
		
				

	}

}
