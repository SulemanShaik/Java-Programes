package PART_001_Java_Programe_Interview;

public class PrintAllPosibilities1234 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=0;i<4;i++)
		{
		for(j=i+1;j<=4;j++)
		{
		System.out.print(j);
		}
		for(k=1;k<=i;k++)
		{
		System.out.print(k);
		}
		System.out.print(" ");
		for(k=i;k>=1;k--)
		{
			System.out.print(k);
		}
		for(j=4;j>=i+1;j--)
		{
			System.out.print(j);
		}
	
		

	}
	}
}

/*1234
1243
1324
1342
1423
1432
2134
2143
2314
2341
2413
2431
3124
3142
3214
3241
3412
3421
4123
4132
4213
4231
4312
4321*/