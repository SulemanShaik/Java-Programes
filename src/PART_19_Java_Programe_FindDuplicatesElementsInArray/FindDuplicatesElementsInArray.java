package PART_19_Java_Programe_FindDuplicatesElementsInArray;

import java.util.HashSet;

public class FindDuplicatesElementsInArray {

	public static void main(String[] args) {
		
		
		String arr[]= {"java","testing","selenium","java"};
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		 {
			for(int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j])
			     {
					System.out.println("FOUND DUPLICATE ELEMENT:"+arr[i]);
					flag=true;
				}	
			}
		}
		
		if (flag==false)
	    {
		    System.out.println("DUPLICATE ELEMENT NOT FOUND");	
		}
		
		//2nd Approach
		        /* boolean flag=false;
		         
		         HashSet<String>hset=new HashSet();
		         
		         for(String st:arr) 
		         {
		        	 if(hset.add(st)==false)
		        	 {
		        		 System.out.println("Found Duplicate");
		        		 flag=true;
		        	 }
		         }
		         if(flag==false) 
		         {
		        	 System.out.println("Not Found Duplicate");
		         }*/
	}

}
