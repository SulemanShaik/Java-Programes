package PART_16_Java_Programe_TwoArraysEqualsorNot;

import java.util.Arrays;

public class TwoArraysEqualsorNot {

	public static void main(String[] args) {
               
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,7,5,6};
		
		boolean status=Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("Arrays Are equals");
		}else {
			System.out.println("Arrays Are not equals");
		}
	}

}
