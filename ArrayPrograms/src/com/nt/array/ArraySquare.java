package com.nt.array;

import java.util.Arrays;

public class ArraySquare {

	public static void main(String[] args) {
		int arr[]= {5,-3,4,-1,0};
		System.out.println("The original Array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("The sorted Array:"+Arrays.toString(arr));
		int sqr=0;
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=arr[i]*arr[i];
		
			System.out.println("The Square Array is:"+arr[i]);
		}
	}

}
