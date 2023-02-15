package qedge.dec30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript5_login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jsex = (JavascriptExecutor)driver;
		jsex.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(4000);
		// insert value  without using sendkeys
		jsex.executeScript("document.querySelector(\"#txtUsername\").value='Admi'");
		jsex.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		jsex.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(4000);
		String expected = "dashboard";
		String actual = jsex.executeScript("return document.URL").toString();
		if(actual.contains(expected))
		{
			System.out.println("login success :: "+expected+"        "+actual);
		}
		else
		{
			String errormessage = jsex.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(errormessage+"      "+expected+"     "+actual);
		}
		
		
		
	}

}
