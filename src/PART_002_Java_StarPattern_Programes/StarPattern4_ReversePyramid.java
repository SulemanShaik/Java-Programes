package PART_002_Java_StarPattern_Programes;

public class StarPattern4_ReversePyramid {

	public static void main(String[] args) {

		/*for(int i=6;i>=1;i--) {
			
			
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		for(int i=6;i>=1;i--)          
		{
			for(int j=1;j<6-i;j++)         
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)           
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		 
	}

}
