/*?
 * ListIterator:- By using ListIterator we can move either to the forward direction or to the backward
 * direction & hence it is bidirectional cursor.
 * By using ListIterator we can perform replacement & addition of new objects in addition to read 
 * & remove operations.
 * The most powerful cursor is ListIterator But Its limitations is,it is applicable only for list Objects. 
 */
package com.nt.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("balarishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String s=(String) ltr.next();
			if(s.equals("venki")) {
				ltr.remove();
				System.out.println(l);
			}
			else if(s.equals("nag")) {
				ltr.add("raju");
				System.out.println(l);
			}
			else if(s.equals("raju")) 
				ltr.set(" ");
			
				System.out.println(l);
			}
			
		}

	}


