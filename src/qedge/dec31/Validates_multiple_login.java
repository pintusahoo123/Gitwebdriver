package qedge.dec31;
import java.io.*;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validates_multiple_login {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str ="";
		while ((str=br.readLine())!=null) {
			String x[] = str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(x[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(x[1]);
			driver.findElement(By.cssSelector("#btnLogin")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			String expected = "dashboard";
			String actual =driver.getCurrentUrl();
			System.out.println(x[0]+"       "+x[1]);
			if (actual.contains(expected)) {
				System.out.println("login succes::"+expected+"     "+actual);
				
			}
			else
			{
				System.out.println("login failed ::"+expected+"    "+actual);
			}
			driver.close();
		}
		
		

	}

}
