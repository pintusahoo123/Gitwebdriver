package qedge.dec16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validates_login {
	

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		
		// store user nname text box  into webelement
		WebElement objuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		// clear text in username
		objuser.clear();
		// send values in textbox
		objuser.sendKeys("Admin");
		Thread.sleep(5000);
		//  capture username value during run time
		String uservalue = objuser.getAttribute("value");
		// store password text box into webelement
		WebElement objpass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//  clear text in password 
		objpass.clear();
		// send values in password textbox
		objpass.sendKeys("Qedge123!@#");
		Thread.sleep(2000);
		// capture user password during runtime
		String passvalue = objpass.getAttribute("value");
		System.out.println(uservalue+"   "+passvalue);
		// click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		String expected ="dashboard";
		String actual = driver.getCurrentUrl();
		if (actual.contains(expected))
		{
			System.out.println("login succesful =="+expected+"     "+actual);
			
		}
		else
		{
			// capture error message
			String errormessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(errormessage+"   "+expected+"   "+actual);
		}
		driver.close();
		
		
		
	}

}












