package PART_002_Java_Pattern_Programes;

public class NumberPattern1 {

	public static void main(String[] args) {

		for(int i=1; i<=4;i++)   //Reading Rows
		{
		
			  //for(int j=1; j<=i; i++)  // Reading columns  
			for(int j=i;j>=1; j--)
			  {
				  System.out.print("*");
			  }
			  
			  System.out.println();
		}
		
	
		
	}

}
             /*1
               12
               123
               1234*/