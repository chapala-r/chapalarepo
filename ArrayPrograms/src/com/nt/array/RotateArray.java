package com.nt.array;
//java program to rotate an array by d elements
public class RotateArray {
//function to left rotate arr[] of size n by d
	void leftRotate(int arr[],int d,int n) {
		for(int i=0;i<d;i++)
			leftRotatebyOne(arr,n);
	}
	void leftRotatebyOne(int arr[],int n) {
		int i,temp;
		temp=arr[0];
		for(i=0;i<n-1;i++) 
			arr[i]=arr[i+1];
		arr[i]=temp;
	}
	//utility function to print an array
	void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) 
			System.out.println(arr[i]+" ");
	}
	public static void main(String[] args) {
		RotateArray rotate=new RotateArray();
		int arr[]= {1,2,3,4,5,6,7};
		rotate.leftRotate(arr,2,7);
		rotate.printArray(arr,7);
				
	}

}
