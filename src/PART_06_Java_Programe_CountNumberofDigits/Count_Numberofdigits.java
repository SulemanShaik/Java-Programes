package PART_06_Java_Programe_CountNumberofDigits;

public class Count_Numberofdigits {
    public static void main(String[] args) {
	
	
	      int num=123456;
	      int count=0;
	      
	      while(num>0) 
	      {
	    	  num=num/10;
	    	  count++;
	      }
	      System.out.println("NO OF DIGITS OF GIVEN NUMBER IS-->"+count);
	
	
}
}
