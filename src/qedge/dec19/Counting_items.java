package qedge.dec19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Counting_items {
	public static void main(String[] args) throws Throwable{
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		// store list box in select class
		Select element = new Select (driver.findElement(By.id("searchDropdownBox")));
		// get collection of items in list box
		List<WebElement> all_items = element.getOptions();
		System.out.println(all_items.size());
		Thread.sleep(3000);
		for (WebElement each : all_items) {
			System.out.println(each.getText());
			Thread.sleep(2000);	
		}
		Thread.sleep(2000);
		driver.close();


	}

}
