/*?
 * Exception Chaining:-
 * One exception class/object will provides information about 
 * another exception class/object.
 */
package com.nt.exception;

import java.io.IOException;

public class ExceptionChaining {
	static void m1()throws Throwable {
		try {
			int a=10/0;
		}
		catch(Exception e) {
			//e.printStackTrace();
			throw e.initCause(new IOException("We are unable to hold,"
					+ "read and write infinity values"));
		}
	}
	public static void main(String[] args) {
		try{
			m1();
		}
		catch(Throwable t) {
	System.out.println(t.getCause());
	}
	}
}

