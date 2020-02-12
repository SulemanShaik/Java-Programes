 package PART_001_Java_Programe_Interview;

public class StringReverse {
	
	
	
	
	public static void main(String[] args) {
		
		String str="javaprogrames";
		
		String rev=" ";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
	
	
	

}
