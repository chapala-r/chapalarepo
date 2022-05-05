package com.nt.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=1;i<=5;i++) {
			l.add(i);//add all values 
			System.out.println(l);//print elements
		//	l.remove(3);//remove element at index 3
			System.out.println(l);
		for(int j=0;j<l.size();j++) {
			System.out.println(l.get(j)+" ");
		}
		}
	}

}
