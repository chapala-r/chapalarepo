package com.nt.array;

public class SortAndRemoveAnArray {

	public static void main(String[] args) {
		int[] arr= {5,8,3,5,18,6,13};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					
				System.out.println(arr[i]+" ");
			}
				//System.out.println();
				if((arr[i]==arr[j])&&(i!=j)) {
					
				System.out.println(arr[j]+" ");
				}
			}
			
		}
		
	}
}


