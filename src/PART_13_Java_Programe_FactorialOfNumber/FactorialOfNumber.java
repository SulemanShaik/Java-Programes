package PART_13_Java_Programe_FactorialOfNumber;

public class FactorialOfNumber {

	public static void main(String[] args) {
                    
		//A factorial is function that multiplies a number by every number below it.
		//5!=5*4*3*2*1=120 or 1*2*3*4*5  = 120
		
		int num=5;
		float factorial=1;
		
		for(int i=1;i<=num;i++) {
			
			factorial=factorial*i;
		}
		
		System.out.println(factorial);
		
	}

}
