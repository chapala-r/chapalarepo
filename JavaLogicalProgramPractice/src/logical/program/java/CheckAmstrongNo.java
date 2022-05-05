package logical.program.java;

import java.util.Scanner;

public class CheckAmstrongNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=scn.nextInt();
		int t1=no;
		int length=0;
		while(t1 !=0) {
			length=length+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		
		while(t2 !=0) {
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+ " is an amstrong number");
		}
		else {
			System.out.println(no+ " is not an amstrong number");
		}
	}

}
