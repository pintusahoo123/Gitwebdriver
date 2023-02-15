package qedge.dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mouse {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.tatacliq.com/");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("wzrk-cancel"))).click().perform();  // closing webpage pop-up
		Thread.sleep(3000);
		// mouse hover to categories
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Categories')]"))).perform();
		Thread.sleep(4000);
		// mouse hover to gadgets
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]"))).perform();
		Thread.sleep(4000);
		// then click Bluetooth Speakers
		ac.moveToElement(driver.findElement(By.linkText("Bluetooth Speakers"))).click().perform();
		Thread.sleep(4000);
		driver.quit();
		
	}
	
		
	

	

}
