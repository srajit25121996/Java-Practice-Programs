package com.sr.collections;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("b", "banana");
		tm.put("c", "cat");
		tm.put("a", "apple");
		tm.put("d", "dog");
		tm.put("g", "gun");
		System.out.println(tm);
		System.out.println(tm.ceilingEntry("c"));
		System.out.println(tm.higherEntry("e"));
		System.out.println(tm.floorKey("e"));
		System.out.println(tm.lowerKey("e"));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
        System.out.println(tm.descendingMap());
        System.out.println(tm);
	}

}
