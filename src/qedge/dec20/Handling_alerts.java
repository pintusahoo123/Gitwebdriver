package qedge.dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_alerts {

	public static void main(String[] args) throws Throwable {
		WebDriver  driver = new FirefoxDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		// click sign in buttons  without username and password
		driver.findElement(By.name("proceed")).click();
		// capture alert  text in a diolouge window
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(4000);
		// click ok to alerts
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
