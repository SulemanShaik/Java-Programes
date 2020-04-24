package PART_001_Java_Programe_Interview;

import java.util.Arrays;

public class SortTheArrayDescendingOrder {

	public static void main(String[] args) {
                    
		//int arr[]= {7,8,3,1,6}; //Initialize array 
		
		int [] arr = new int [] {5, 2, 8, 7, 1};  //Initialize array   
		
		System.out.println("Before Swapping the Elements");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		 for (int i = 0; i < arr.length-1; i++)    //Number of passes
		 {
			
			for (int j = 0; j < arr.length-1; j++)   //iteration  in each pass
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		 }
		 System.out.println();
		 
		 System.out.println("After Swapping the Elements");
		 for (int i = 0; i < arr.length; i++) 
			{
				System.out.print(arr[i]+" ");
			}
		
	}

}
