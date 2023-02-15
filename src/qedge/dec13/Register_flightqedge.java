package qedge.dec13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_flightqedge {

	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("pintu");
		driver.findElement(By.name ("contact")).sendKeys("1238444999");
		driver.findElement(By.name("email")).sendKeys("pintusah@gamil.com");
		driver.findElement(By.name("password")).sendKeys("pintu@12");
		driver.findElement(By.name("gender")).sendKeys("Male");
		driver.findElement(By.name("dob")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("13")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("flexCheckChecked")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
