package PART_03_Java_Programe_ReverseString;

public class StringReverse {

	public static void main(String[] args) {
		//Reverse string means reverse of a given string
		//1. Logic1 Using String Concatination (+) Operator
		
		
		 String str="abcd";
		 String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse String is->"+rev);
		
		//2. Using StringBuffer Class
		
		/*StringBuffer sb = new StringBuffer(str);
		StringBuffer sbr=sb.reverse();
		System.out.println(sbr);*/
		
		
		
	}

}
