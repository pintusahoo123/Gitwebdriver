package qedge.dec21;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_window2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		//  click three options
		driver.findElement(By.xpath("(//span[@class='allcircle circleone'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='allcircle circletwo'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='allcircle circlefour'])[1]")).click();
		Thread.sleep(5000);
		// store all windows with arraylist
		ArrayList<String> abc = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(abc);
		Thread.sleep(4000);
		// switch to  3rd tab window
		driver.switchTo().window(abc.get(3));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='eType']")).click();
		Thread.sleep(4000);
		driver.close();
		// switch to 2nd tab window
		driver.switchTo().window(abc.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(4000);
		driver.close();
		//  switch to parent window
		driver.switchTo().window(abc.get(0));
		driver.findElement(By.xpath("(//a[normalize-space()='HOLIDAYS'])[1]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='Person With Disability Concession'])[1]")).click();
        String message = driver.findElement(By.xpath("(//span[@class='ui-confirmdialog-message ng-tns-c56-7'])[1]")).getText();
        System.out.println(message);
        Thread.sleep(4000);
        driver.close();
        // switch to 1st tab window
        driver.switchTo().window(abc.get(1));
        driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).sendKeys("bbs");
        Thread.sleep(4000);
        driver.quit();
	}
	
	

}
