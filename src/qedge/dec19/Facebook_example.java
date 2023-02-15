package qedge.dec19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_example {

	public static void main(String[] args) throws Throwable {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		Select element = new Select (driver.findElement(By.id("year")));
		List<WebElement> all_year = element.getOptions();
		System.out.println(all_year.size());
		Thread.sleep(2000);
		for (WebElement each : all_year) {
			System.out.println(each.getText());
			Thread.sleep(500);
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
