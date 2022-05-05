package com.nt.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("In main method start");
		try {
		m1();
		}
		catch(ArithmeticException ae) {
			System.out.println("In main catch");
		}
		System.out.println("In main method end");
	}
		static void m1() {
			//try {
				System.out.println("In main method start");
				System.out.println(10/0);
				System.out.println("In main method end");
			//}
			//catch(ArithmeticException ae) {
				//System.out.println("In m1 catch");
			//}
		}

	}

