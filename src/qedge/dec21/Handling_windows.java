package qedge.dec21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://accounts.google.com/");
		Thread.sleep(5000);
		// get mail parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//  click three links to open in new tab
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		// get all window id
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		// i want to switch  one by one child window and return that title and close
		for (String each : allwindow) {
			// parent window should not equal to child window
			if (!parent.equals(each)) {
		   // gettile of each child window and close one by one
				String pagetitle  = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(4000);
				driver.close();
			}
			
		}
		// switch to parent
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("pintu1234");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
