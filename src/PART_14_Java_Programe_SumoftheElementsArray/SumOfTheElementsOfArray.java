package PART_14_Java_Programe_SumoftheElementsArray;

public class SumOfTheElementsOfArray {

	public static void main(String[] args) {
           
		
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		for(int i=0;i<a.length-1;i++) //a[0],a[1],a[2]
		{
			sum=sum+a[i];
				
		}
		
		System.out.println("Sum of the elements of the given array-->"+sum);
		
		
		
	}

}
