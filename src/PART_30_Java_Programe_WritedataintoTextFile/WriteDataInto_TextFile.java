package PART_30_Java_Programe_WritedataintoTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInto_TextFile {

	public static void main(String[] args) throws IOException {
             
		
		FileWriter fw = new FileWriter("F:\\WritedataintoTextFilePrograme");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Welcome to java programe");
		bw.write("Write data into TextFile");
		bw.write("How to write Write data into TextFile");
		
		System.out.println("Finished....");
		bw.close();
	}

}
