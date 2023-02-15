package qedge.dec31;

import java.io.*;

public class Writetext_file {

	public static void main(String[] args) throws Throwable {
		//create new file
		File f = new File("D:/sample.txt");
		FileWriter fw = new FileWriter(f);             // write data in file which is physically available
		BufferedWriter bw = new BufferedWriter(fw);    // this is allocate memory for the physical file
		bw.write("i love to listing music");           // write method is used to write text in single line
		bw.newLine();                                  // this is used to move next line in a file
		bw.write(" but i dont sing");
		bw.newLine();
		bw.write("thats why i am a bathroom singer");
		bw.flush();
		bw.close();
		
		

	}

}
