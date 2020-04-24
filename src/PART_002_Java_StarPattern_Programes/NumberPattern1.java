package PART_002_Java_StarPattern_Programes;

public class NumberPattern1 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<6;i++)
		{
			int count=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println(" ");
		}
	}

}
/*1
  12
  123
  1234
  12345*/