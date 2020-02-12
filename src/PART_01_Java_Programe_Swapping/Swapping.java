package PART_01_Java_Programe_Swapping;

public class Swapping {

	public static void main(String[] args) {
		
		//Swapping means interchanging the values
		
	    //1.Logic-1 using Third Variable
		
		int a=10; int b=20;
		
		/*int temp;
		System.out.println("BEFORE SWAPPING  a and b VALUES ARE => "+a +" "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("AFTER SWAPPING  a and b VALUES ARE => "+a +" "+b);*/
		
		
		//2.Logic-2 without using Third Variable
		System.out.println("BEFORE SWAPPING  a and b VALUES ARE => "+a +" "+b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("AFTER SWAPPING WITHOUT USING THIRD VARIABLE  a and b VALUES ARE => "+a +" "+b);
		

	}

}
