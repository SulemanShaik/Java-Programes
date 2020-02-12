package PART_29_Java_Programe_ReadingdatafromTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingdatafrom_TextFile {

	public static void main(String[] args) throws IOException {
       
		
		
		FileReader fr= new FileReader("F:\\Readingtextfile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
          {
	         System.out.println(str);
            }
			br.close();	
	}

}
