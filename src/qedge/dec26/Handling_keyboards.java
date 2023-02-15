package qedge.dec26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_keyboards {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		// create object for actions class
		Actions ac = new Actions(driver);                                 // use control space for actions class and actions driver
		driver.findElement(By.name("q")).sendKeys("selenium openings ");
		Thread.sleep(4000);
		// press down arrow for three times 
		ac.sendKeys(Keys.ARROW_DOWN).perform();                           // use control space for keys
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		// click enter buttons
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
