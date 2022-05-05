package com.nt.array;

public class SecondHighestArray {

	public static void main(String[] args) {
		int[] a= {5,8,3,7,2,15};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) { //for printing element of an array in descending order 
			System.out.println(a[i]+" ");
		}
	System.out.println("Second largest array is :"+a[1]);//printing second largest array element
	}

}
