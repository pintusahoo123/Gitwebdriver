package qedge.dec27;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		// mouse hover to gmail link and right click on it
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		// create object for robot class for accesing multiple window
		Robot r = new Robot();
		// press down arrow for two times using robot method 
		r.keyPress(KeyEvent.VK_DOWN);                     // keypress for pressing the key
		r.keyRelease(KeyEvent.VK_DOWN);                   // key release for release after pressing the key
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);                     
		r.keyRelease(KeyEvent.VK_DOWN);                   
		Thread.sleep(3000);
		// click enter buttons
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		// store collection of windows into array list 
		ArrayList<String> browser = new ArrayList<String>(driver.getWindowHandles());
		// switch to gmail window
		driver.switchTo().window(browser.get(1));
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Sign in"))).click().perform();
		driver.findElement(By.name("identifier")).sendKeys("pintusahoo9348@gmail.com");
		Thread.sleep(4000);
		driver.close();
		// switch to parent and perform some action
		driver.switchTo().window(browser.get(0));
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
