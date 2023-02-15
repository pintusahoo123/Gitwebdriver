package qedge.dec31;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writetext2_file {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/selenium.txt");
		//File f = new File("D:/selenium.doc");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("http://primusbank.qedgetech.com/");
		 Thread.sleep(5000);
		 String para1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		 String para2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
		 bw.write(para1);
		 bw.newLine();
		 bw.newLine();                       // for creating more space in between para  i use  new line for three times
		 bw.newLine();
		 bw.write(para2);
		 bw.flush();
		 bw.close();
		 driver.close();
		 
		 
		 
				 
		
		
	}

}
