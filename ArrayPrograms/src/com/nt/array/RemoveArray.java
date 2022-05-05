package com.nt.array;

public class RemoveArray {
	public static int removeDuplicateElement(int arr[],int n) {
	if(n==0||n==1) {
		return n;
	}
	int j=0; //for next element
	for(int i=0;i<n-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr[j++]=arr[i];
		}
	}
	arr[j++]=arr[n-1];
	return j;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,40,20,20,30,30,50,50};
		int length=arr.length;
		length=removeDuplicateElement(arr,length);
	//for printing array element
		for(int i=0;i<length;i++)
			System.out.println(arr[i]+" ");
	}

}
