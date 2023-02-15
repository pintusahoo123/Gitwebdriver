package qedge.dec13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_instagram {
	public static void main(String[] args) throws Throwable {
		// login for instagram
		System.setProperty("Webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("itz_me_pin_2");
		driver.findElement(By.name("password")).sendKeys("pintu.sahoit");
		driver.findElement(By.xpath("(//div[contains(@class,'_abak _abb8 _abbq _abb- _abcm')])[1]")).click();
		Thread.sleep(6000);
		
		
	}

}
