/*?
 * Enumeration:- We can use enumeration to get objects one by one from legacy collection object.
 * We can create enumeration object by using elements method of vector class.
 * Limitations:-1. We can apply Enumeration concept only for legacy classes & it is not a universal cursor.
 * 2.By using Enumeration we can get only read access & we can't perform remove operation.
 * To overcome above limitations we should go for Iterator.
 */
package com.nt.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println(v);
	}

}
