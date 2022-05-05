package com.nt.array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array1= {12,5,45,64,25,8,35};
		
		String[] array2= {"java","c programimg","python","c++"};
		System.out.println("The original numeric array:"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("The sorted numeric array:"+Arrays.toString(array1));
		
		System.out.println("The original string array:"+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("The sorted string array:"+Arrays.toString(array2));
		
	}

}
