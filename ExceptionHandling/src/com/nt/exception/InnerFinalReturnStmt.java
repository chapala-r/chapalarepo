package com.nt.exception;

public class InnerFinalReturnStmt {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	static int m1() {
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
					return 10;
				}
				//System.out.println("After Inner try/catch/finally"); 	
					
				}
		catch(NullPointerException npe) {
			System.out.println("In outer catch");
		}
		finally {
			System.out.println("In outer finally");
			//return 30;
		}
		System.out.println("After outer try/catch/finally");
		return 30;
		}
	}


