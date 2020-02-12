package PART_25_Java_Programe_RemoveWhiteSpacesGivenString;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
                 
		
		String str="java   programing selenium automation          manaul testing";
		
		
		str=str.replaceAll("\\s", "");
		System.out.println("After Remove white spaces->"+str);
	}

}
