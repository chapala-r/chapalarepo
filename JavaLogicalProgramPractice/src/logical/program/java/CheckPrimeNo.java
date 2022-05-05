//A number is called prime number if it is only divisible by 1 or itself,which means prime number doesn't 
//have any positive divisor other than itself.
package logical.program.java;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scn.nextInt();
		//int num=7;
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
			if(temp==0) {
				System.out.println(num+" is prime number");
			}
			else {
				System.out.println(num+" is not prime number");
			}
		}
		
	}


