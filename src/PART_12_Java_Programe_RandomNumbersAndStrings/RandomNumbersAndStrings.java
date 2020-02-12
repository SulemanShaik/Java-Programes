package PART_12_Java_Programe_RandomNumbersAndStrings;

import java.util.Random;

//import org.apache.commons.lang3.RandomStringUtils;


public class RandomNumbersAndStrings {

	public static void main(String[] args) {
	        
		
		// Generate Random Integers - Approach-1 using Random Class

		 Random rand = new Random();
		 
		 int rand_num=rand.nextInt(10);//it will consider 0 to 9
		 //int rand_num=rand.nextInt(100);//it will consider 0 to 99
		 System.out.println(rand_num);
		 
		//approach 2:    apache commons-lang API we need jars to get this class
		/* String randString = RandomStringUtils.randomAlphabetic(10);
			System.out.println(randString);
		 */
		 
		 
		 
		 
	}

}
