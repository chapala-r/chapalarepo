/*?
 * Comparator present in java.util package & it defines 2 methods compare & equals.
 * Q:- W.a.p to insert integer objects into the treeset where the sorting order is descending order.
 */
package com.nt.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else 
			return 0;
	}
}
