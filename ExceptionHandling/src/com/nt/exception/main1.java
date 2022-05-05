package com.nt.exception;
class Test extends Exception{
	
}
public class main1 {

	public static void main(String[] args) {
		try {
			throw new Test();
		}
		catch(Test t) {
			System.out.println("Got the test exception");
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
