package qedge.dec15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_text {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(3000);
		// capture gmail text in google page
		String visibletext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visibletext);
		// capture gmail link (internal part)
		String invisibletext = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(invisibletext);
		driver.close();
		
	}

}
