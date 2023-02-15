package qedge.dec21;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_window3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://accounts.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		ArrayList<String> abc = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(abc);
		Thread.sleep(5000);
		driver.switchTo().window(abc.get(3));
		driver.findElement(By.xpath("(//input[@placeholder='Describe your issue'])[1]")).sendKeys("pintu you");
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(abc.get(1));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
