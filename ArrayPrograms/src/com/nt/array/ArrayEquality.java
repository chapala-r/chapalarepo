//w.a.p to check the equality of two arrays.

package com.nt.array;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int[] arrayOne= {1,2,3,4,5};
		int[] arrayTwo= {1,2,3,4,5};
		//int[] arrayTwo= {1,2,3,4,6};

/*		boolean equalOrNot=Arrays.equals(arrayOne,arrayTwo);
		System.out.println("Input arrays:");
		System.out.println("First array:"+Arrays.toString(arrayOne));
		System.out.println("Second array:"+Arrays.toString(arrayTwo));
		if(equalOrNot) {
			System.out.println("Two arrays are Equal");
		}
		else {
			System.out.println("Two arrays are Not Equal");
		}
	}
}*/
		
		boolean equalOrNot=true;
		if(arrayOne.length==arrayTwo.length) {
			for(int i=0;i<arrayOne.length;i++) {
				if(arrayOne[i]!=arrayTwo[i]) {
					equalOrNot=false;
				}
			}
		}
		else {
			equalOrNot=true;
		}
	System.out.println("Input Arrays:");
	System.out.println("First Array:"+Arrays.toString(arrayOne));
	System.out.println("Second Array:"+Arrays.toString(arrayTwo));

	if(equalOrNot) {
		System.out.println("Two arrays are Equal");
	}
	else {
		System.out.println("Two Arrays are Not Equal:");
			
	}
	}

}
