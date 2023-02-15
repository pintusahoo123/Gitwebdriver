package qedge.dec22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition_methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(4000);
		// verify first name text box is enabled or disabled
		WebElement firstname = driver.findElement(By.name("firstname"));
		boolean value = firstname.isEnabled();
		System.out.println(value);
		// verify reenter email textbox is displayed or hidden
		WebElement element = driver.findElement(By.name("reg_email_confirmation__"));
		boolean value2 = element.isDisplayed();
		System.out.println(value2);
		// verify  radio button is selected or not
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='1']"));
		boolean value3 = radiobutton.isSelected();
		System.out.println(value3);
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
