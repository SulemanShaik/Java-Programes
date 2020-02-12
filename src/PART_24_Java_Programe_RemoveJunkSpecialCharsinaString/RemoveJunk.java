package PART_24_Java_Programe_RemoveJunkSpecialCharsinaString;

public class RemoveJunk {

	public static void main(String[] args) {
           
		String s="@&^%$*(&^#@!1234Java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");           //^charOperator
		System.out.println(s);
		
		
		String s1="&&&&#!@programe";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");       //^charOperator
		System.out.println(s1);
	}

}
