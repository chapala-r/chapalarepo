package com.nt.array;

public class SwapArrayElement {

	public static void main(String[] args) {
		int[] arr= {4,6,3,2,5};
		int src=0;
		int dest=1;
		int temp=arr[src];
		arr[src]=arr[dest];
		arr[dest]=temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr [i]+" ");
		}
	}

}
