package PART_002_Java_Pattern_Programes;

public class NumberPattern2 {

	public static void main(String[] args) {
		
           int count=0;    
           
		for(int i=1;i<=4; i++)
		{
			for(int j=1; j<=i; i++)
			{
				 count=count+1;
				System.out.print(count);
			}
			System.out.println();
		}
		
	}

}
                 /*1
                   23
                   456
                   78910*/
                   