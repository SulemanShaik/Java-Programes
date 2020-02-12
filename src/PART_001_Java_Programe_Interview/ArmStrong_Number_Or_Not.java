package PART_001_Java_Programe_Interview;

import java.util.Scanner;

public class ArmStrong_Number_Or_Not {

	public static void main(String[] args) {
	//Sum of the cubes of its digits is equal to the number itself
		
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number to check armstrong or not");
    int n=sc.nextInt();
    int a,c=0;
    int temp;
    temp=n;
    while(n>0)
    {
    	a=n%10;
    	c=c+(a*a*a);
    	n=n/10;
    	
    }
    if(temp==c) {
    	System.out.println("Given Number is ArmStrong");
    }
    else {
    	System.out.println("Given Number is not an ArmStrong");
    }
    
    
	}

}
