package qedge.dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_command {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println("pagetitle 1 "+driver.getTitle());
		// click gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("pagetitle 2 " +driver.getTitle());
		Thread.sleep(3000);
		// click back buttons
		driver.navigate().back();
		System.out.println("pagetitle 3 " +driver.getTitle());
		Thread.sleep(3000);
		// click forward buttons
		driver.navigate().forward();
		System.out.println("pagetitle 4 " +driver.getTitle());
		Thread.sleep(3000);
		//click refresh buttons
		driver.navigate().refresh();
		System.out.println("pagetitle 5 " +driver.getTitle());
		driver.quit();
	
	}

}
