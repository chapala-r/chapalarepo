/*?
 * We can apply iterator concept for any collection object & hence it is universal cursor.
 * By using iterator we can perform both the read & remove operations.
 * Limitations:- By using Enumeration & iterator we can always move only towards forward direction
 * & we can't move towards backward direction. These are single direction cursor but not
 *  Bidirectional cursor.
 *  By using iterator we can perform only read & remove operations & we can't perform replacement 
 *  & addition of new objects.
 *   * To overcome above limitations we should go for ListIterator. 
 */
package com.nt.cursor;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer) itr.next();
			if(i%2==0)
				System.out.println(i);
			else {
				itr.remove();
			}
			System.out.println(l);
		}
	}

}
