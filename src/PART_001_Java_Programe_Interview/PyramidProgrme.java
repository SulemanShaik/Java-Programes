package PART_001_Java_Programe_Interview;

public class PyramidProgrme {

	public static void main(String[] args) {
           
	
		
		for(int i=1;i<6;i++)             //TO Read Columns
		{
			for(int j=1;j<6-i;j++)         //TO READ SPACES
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)           //TO PRINT *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
