//w.a.p to find second largest element in an array of integers.
package com.nt.array;

import java.util.Arrays;

public class SecondLargeArray {
	static void secondLargest(int[] input) {
		int firstLargest = 0,secondLargest = 0;
		//checking first two elements of input array
		if(input[0]>input[1]) {
			//if first element is greater than second element
			firstLargest=input[0];
			secondLargest=input[1];
		}
		//checking remaining elements of input array
		for(int i=2;i<input.length;i++) {
			if(input[i]>firstLargest) {
			//if element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
				secondLargest=input[1];
			}
			}
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(input));
		System.out.println("Second Largest element");
		System.out.println(secondLargest);
	}
	
			
		
	

	public static void main(String[] args) {
		secondLargest(new int[] {222,333,111,555,666});
	}
}
