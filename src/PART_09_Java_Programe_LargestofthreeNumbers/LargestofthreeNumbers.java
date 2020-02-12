package PART_09_Java_Programe_LargestofthreeNumbers;

import java.util.Scanner;

public class LargestofthreeNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter First Number");
		int b=sc.nextInt();
		
		System.out.println("Enter First Number");
		int c=sc.nextInt();
		
		
		if(a>b&&a>c) {
			System.out.println(a+"-> is The Biggest Number");
		}
		else if(b>a&&b>a) {
			System.out.println(b+"-> is The Biggest Number");
		  }
		
		else {
			System.out.println(c+"-> is The Biggest Number");
		}
		}
		
		}

	


