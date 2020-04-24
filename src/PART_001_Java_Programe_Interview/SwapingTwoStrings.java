package PART_001_Java_Programe_Interview;

public class SwapingTwoStrings {

	public static void main(String[] args) {

		String str1="Hello";
		String str2="World";
		String temp=" ";
		
		temp=str1;
		str1=str2;
		str2=temp;
		//System.out.println("After Swapping->"+ str1+str2);
		System.out.println("After Swapping->"+ str1);
		System.out.println("After Swapping->"+ str2);
	}

}
