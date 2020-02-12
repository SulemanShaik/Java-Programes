package PART_11_Java_Programe_PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		int n= sc.nextInt();
		boolean flag=true;
		for (int i=2;i<n;i++) {
			if(n%i==0)
			{
				flag=false;
			}
		}
			if(flag==true) {
				System.out.println("Given number is prime");
			}
			else {
				System.out.println("Given number is not prime");
			}
			
		}
		}