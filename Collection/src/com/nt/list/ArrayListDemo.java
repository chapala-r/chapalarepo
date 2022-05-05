/*?
 * The underlying ds is Risizable array/Growable array
 */
package com.nt.list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaring an ArrayList object 
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		l.add("c");
	//	l.add(null);
		l.add(null);//null insertion is possible
		l.add(10);//Heterogeneous objects are allowed
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(10);//Duplicates are allowed
		System.out.println(l);
		l.add(2,"m");
		System.out.println(l);//[A,B,m,null,10,10] insertion order is preserved.
	}

}
