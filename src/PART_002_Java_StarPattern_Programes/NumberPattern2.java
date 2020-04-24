package PART_002_Java_StarPattern_Programes;

public class NumberPattern2 {

	public static void main(String[] args) {
            
		int count=1;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count + " " );
				count++;
			}
			System.out.println();
		}
		
	}

}

 /*1
  23
  456
  78910
  1112131415*/