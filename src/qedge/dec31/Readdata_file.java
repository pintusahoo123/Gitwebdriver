package qedge.dec31;
import java.io.*;

public class Readdata_file {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String data ="";
		while ((data=br.readLine())!=null) {
			Thread.sleep(400);
			System.out.println(data);
			
		}
		
	}

}
