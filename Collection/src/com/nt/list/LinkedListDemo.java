package com.nt.list;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("chapu");
		l.add("30");
		l.add(null);
		l.add("chapu");
		System.out.println(l);
		l.set(0,"Software");
		l.add(1,"rout");
		l.set(1,"sdff");
		l.add(1,"sdff");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("welcome");
		System.out.println(l);
		
	}

}
