package com.nt.exception;

public class InnerCatch {

	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		try {
			System.out.println("In outer try");
				try {
					System.out.println("In inner try");
					System.out.println(10/0);
				}
				catch(NullPointerException npe) {
					System.out.println("In inner catch");
				}
				finally {
					System.out.println("In inner finally");
				
				}
				System.out.println("After Inner try/catch/finally"); 	
					
				}
		catch(NullPointerException npe) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
			
		}
		System.out.println("After outer try/catch/finally");
	
		}
	}


