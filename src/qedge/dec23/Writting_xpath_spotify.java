package qedge.dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Writting_xpath_spotify {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://open.spotify.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//form[@method='POST']//following::input)[1]")).sendKeys("pintusa@gmail.com");
		driver.findElement(By.xpath("(//form[@method='POST']//following::input)[2]")).sendKeys("pintusa@gmail.com");
		driver.findElement(By.xpath("(//form[@method='POST']//following::input)[3]")).sendKeys("pintu@123");
		driver.findElement(By.xpath("(//form[@method='POST']//following::input)[4]")).sendKeys("Boss");
		driver.findElement(By.xpath("(//form[@method='POST']//following::input)[5]")).sendKeys("1947");
		driver.findElement(By.xpath("//form[@method='POST']//following::select[1]")).sendKeys("january");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[6]")).sendKeys("23");
		driver.findElement(By.xpath("(//form[@method='POST']//following::span)[1]")).click();
		driver.findElement(By.xpath("(//form[@method='POST']//following::span)[12]")).click();
		driver.findElement(By.xpath("(//form[@method='POST']//following::span)[14]")).click();
		driver.findElement(By.xpath("(//form[@method='POST']//following::button)[1]")).submit();
		Thread.sleep(4000);
		
		
		

	}

}
