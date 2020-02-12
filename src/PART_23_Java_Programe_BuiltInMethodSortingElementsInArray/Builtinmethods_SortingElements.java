package PART_23_Java_Programe_BuiltInMethodSortingElementsInArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Builtinmethods_SortingElements {

	public static void main(String[] args) {

		
             // int arr[]= {4,3,1,5,6,2};
              //Appraoch1
		
		/*System.out.println("Array Before Sorting"+Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Array After Sorting"+Arrays.toString(arr));
		
		
		
		
		//Appraoch2
		
				System.out.println("Array Before Sorting"+Arrays.toString(arr));
				
				Arrays.sort(arr);
				System.out.println("Array After Sorting"+Arrays.toString(arr));
				*/
		
		//Reverse Descending Order
        Integer arr[]= {40,30,10,50,60,20};
	System.out.println("Array Before Sorting"+Arrays.toString(arr));
	Arrays.sort(arr,Collections.reverseOrder());
	System.out.println("Array After Sorting"+Arrays.toString(arr));
				
	}
}
