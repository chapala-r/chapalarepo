/*?
 * w.a.p to find duplicate elements in an array.
 */
package com.nt.array;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		String[] StrArray= {"java","jsp","Servlet","java","Structs","jsp","JDBC"};
		for(int i=0;i<StrArray.length-1;i++) {
			for(int j=i+1;j<StrArray.length;j++) {
				if(StrArray[i].equals(StrArray[j]) && (i!=j))
					{
					System.out.println("Duplicate element is:"+StrArray[j]);
				}
			}
		}
		
		
		String[] strArray= {"java","jsp","Servlet","java","Structs","jsp","JDBC"};
		HashSet<String> set=new HashSet<String>();
		for(String arrayEelement:strArray) {
			if(!set.add(arrayEelement)) {
				System.out.println("Duplicate element is:"+arrayEelement);
		}
	}

}
}