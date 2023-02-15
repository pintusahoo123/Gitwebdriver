package qedge.jan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_explicit {

	public static void main(String[] args) {                   // explicit wait is for specific element
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		// create object for class
		WebDriverWait mywait = new WebDriverWait(driver, 10);
		// wait until element clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create New Account")));
		driver.findElement(By.linkText("Create New Account")).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("pintu");

	}

}
