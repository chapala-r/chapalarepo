package com.nt.map;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put("b","baby");
		t.put("a","array");
		t.put("c","cat");
		t.put("d","doll");
		t.put("g","good");
		System.out.println(t);//{a=array,b=baby,c=cat,d=doll,g=good}
		System.out.println(t.ceilingKey("c"));//c
		System.out.println(t.floorKey("d"));//d
		System.out.println(t.lowerKey("c"));//b
		System.out.println(t.pollFirstEntry());//a=array
		System.out.println(t.pollLastEntry());//g=good
		System.out.println(t.descendingMap());//{d=doll,c=cat,b=baby}
	}

}
