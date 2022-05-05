/*?
 * Fibonacci series is the series of natural numbers where the next number is equivalent to the 

 * sum of the previous two numbers like fn=fn-1+fn-2. The first two numbers of the fibonacci series 
 * are always 1,1.
 */

package logical.program.java;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a+" "+b);
		for(int i=1;i<=10;i++) {
			int c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			
		}
	}

}
