package qedge.dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_alerts_primusbank {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new  FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("login")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
