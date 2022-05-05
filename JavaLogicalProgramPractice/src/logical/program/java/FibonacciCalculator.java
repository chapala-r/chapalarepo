
/*?
 * Fibonacci series is the series of natural numbers where the next number is equivalent to the 
 * sum of the previous two numbers like fn=fn-1+fn-2. The first two numbers of the fibonacci series 
 * are always 1,1.
 */
		
package logical.program.java;

import java.util.Scanner;

/*?
 * java program to calculate and print fibonnaci number using both recursion & Iterator
 * First 10 fibonacci numbers are 1,1,2,3,5,8,13,21,34,55
 */
public class FibonacciCalculator {

	public static void main(String[] args) {
		//input to print Fibonacci series upto how many numbers
		System.out.println("Enter number upto which Fibonacci series to print:");
		int number=new Scanner(System.in).nextInt();
		
		System.out.println("Fibonacci series upto"+number+"numbers:");
		//Printing fibonacci series upto number
		for(int i=1;i<=number;i++) {
			System.out.println(fibonacci2(i)+" ");
			
		}
		
	}
	
	/*?
	 * java program for fibonacci number using recursion.
	 * This program uses tail recursion to calculate fibonacci number
	 * for a given number
	 */
	public static int fibonacci(int number) {
		if(number==1 || number==2) {
			return 1;
		}
	return fibonacci(number-1)+fibonacci(number-2);//tail recursion
	}
	/*?
	 * java program to calculate fibonacci number using loop or Iteration.
	 * return fibonacci number
	 */
	private static int fibonacci2(int number) {
		if(number==1 || number==2) {
			return 1;
		}
		int fibo1=1,fibo2=1,fibonacci=1;
		for(int i=3;i<=number;i++) {
		//fibonacci number is sum of previous two fibonacci number
		fibonacci=fibo1+fibo2;
		fibo1=fibo2;
		fibo2=fibonacci;
		}
		return fibonacci;//fibonacci number
	}

}
