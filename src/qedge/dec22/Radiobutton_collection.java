package qedge.dec22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_collection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("pintusa@gamil.com");
		driver.findElement(By.name("password")).sendKeys("pintu@12");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(4000);
		// get collection of radio button
		// for getting collection of radio buttons we go through relative xpath syntax
		List<WebElement> all_buttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(" no of radio buttons are  "+all_buttons.size());
		// print each name of raddio buttons
		for (WebElement each : all_buttons) {
			System.out.println(each.getAttribute("value"));
			
		}
		driver.quit();
		

	}

}
