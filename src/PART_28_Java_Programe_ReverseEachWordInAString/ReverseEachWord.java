package PART_28_Java_Programe_ReverseEachWordInAString;

public class ReverseEachWord {

	public static void main(String[] args) {
                    
		String str="Welcome To Java Programes";  //original String
		
		String[] words=str.split(" ");   //Splitting string into words
		String reverseString="";
		
		for(String w:words)
		{
			String reverseWord="";  //Programes
			
			for(int i=w.length()-1;i>=0;i--)  //To
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" "; //+ concatenation to cover spaces in words
		}
		System.out.println(reverseString);
	}

}
