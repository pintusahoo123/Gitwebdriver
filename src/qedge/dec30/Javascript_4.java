package qedge.dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_4 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jsex = (JavascriptExecutor)driver;
		jsex.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.name("firstname")).sendKeys("pintu");
		driver.findElement(By.name("lastname")).sendKeys("sahoo");
		driver.findElement(By.name("email")).sendKeys("pintusahoo12@gamil.com");
		driver.findElement(By.name("password")).sendKeys("pintu1234");
		jsex.executeScript("window.scrollBy(0,500)");
		jsex.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(2000);
		jsex.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(2000);
		jsex.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
