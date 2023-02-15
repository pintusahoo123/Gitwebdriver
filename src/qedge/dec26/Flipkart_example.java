package qedge.dec26;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_example {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[9]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[3]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("View All"))).click().perform();
		Thread.sleep(4000);
		
		
		
	}

}
