package PART_22_Java_Programe_BubbleSortSearchElement;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {

		int arr[]= {4,3,1,5,6,2};
		
		System.out.println("Array Before Sorting"+Arrays.toString(arr));
	
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) //Number of passes
		{
			for(int j=0;j<n-1;j++)   //iteration  in each pass
			{
				if(arr[j]>arr[j+1])
				    {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
		
		
		System.out.println("Array After Sorting"+Arrays.toString(arr));
		
		
		
	}

}
