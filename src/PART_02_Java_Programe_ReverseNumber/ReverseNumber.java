package PART_02_Java_Programe_ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Reverse number means, reverse of a given number 
				Scanner sc=new Scanner(System.in);
				System.out.println("PLEASE ENTER A NUMBER");
				int num=sc.nextInt();
				
				int rev=0;
			
				while(num!=0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
				System.out.println("Reverse of the given Number is->"+rev);
				
				
				//2.Logic2 - Using StringBuffer Class
				
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse of the given Number is->"+rev);*/
	}

}
