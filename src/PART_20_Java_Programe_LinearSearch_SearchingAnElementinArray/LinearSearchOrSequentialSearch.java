package PART_20_Java_Programe_LinearSearch_SearchingAnElementinArray;

public class LinearSearchOrSequentialSearch {

	public static void main(String[] args) {

		int arr[]= {10,20,40,50};
		boolean flag = false;
		int search_ele=60;
		for(int i=0;i<arr.length;i++)
		{
           if(search_ele==arr[i])
           {
				System.out.println("Element Found");
				flag=true;
				break;
			}
		}
		
		
		if(flag==false) {
			System.out.println("Element Not Found");
			
		}
	}

}
