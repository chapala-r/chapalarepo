package com.nt.array;

public class sumArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int high=arr.length-1;
		int low=0;
		int sum=9;
		while(high>low) {
			if(arr[high]+arr[low]>sum) {
				System.out.println("value is greater than sum");
			}else if(arr[high]+arr[low]<sum) {
			System.out.println("value is smaller than sum");	
			
			}else if(arr[high]+arr[low]==sum) {
				System.out.println("sum of " +arr[high]+ " and " +arr[low]+ " is equal to sum");
			}

			high--;
			low++;
				
		}
			
	}
		
}
