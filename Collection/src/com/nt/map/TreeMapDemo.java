
package com.nt.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap m=new TreeMap();
		m.put(100,"Z");
		m.put(103,"Y");
		m.put(101,"X");
		m.put(104,106);//values are heterogeneous
		m.put(100,"Z");
		//m.put("F","X");//CCE  Keys should be homogeneous
		System.out.println(m);
		//For non empty TreeMap if we are trying to insert null key the it give NPE
		//System.out.println(null,"X");//NPE 
		System.out.println(m);
	}

}
