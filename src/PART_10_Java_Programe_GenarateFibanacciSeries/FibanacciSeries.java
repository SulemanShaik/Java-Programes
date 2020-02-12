package PART_10_Java_Programe_GenarateFibanacciSeries;

public class FibanacciSeries {

	public static void main(String[] args)
	{
               
		   //A series of numbers in which each number(Fibonacci Number)is the sum of the two preceding numbers
		
		  //0 1     1 2 3 5 8 13 21 34
		
		int n1=0; int n2=1;
		
		System.out.print(n1+" "+n2);      //Its print 0 and 1
		
		
		for(int i=2;i<10;i++) 
		{
			int sum=n1+n2;
			
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}
		
		
		
		
		
	}

}
