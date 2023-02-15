package qedge.dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3_scrollelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jvsex = (JavascriptExecutor)driver;
		jvsex.executeScript("window.location='https://amazon.in'");
		Thread.sleep(4000);
		//1st specified to that particular element you want to open
		WebElement element = driver.findElement(By.linkText("Facebook"));
		// scroll to facebook link
		jvsex.executeScript("document.scrollintoView", element);
		Thread.sleep(3000);
		element.click();
		
		
	}

}
