package qedge.dec13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_orangehrm {

	public static void main(String[] args) throws Throwable {
		// create instance object
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // it maximizes  browser window
		driver.manage().deleteAllCookies();  // it  deletes  all opened browser window
		//  launch url
		driver.get("http://orangehrm.qedgetech.com/");
		//suspend tool for 4 seconds
		Thread.sleep(4000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).submit();
		// suspend  tool for 5 seconds
		Thread.sleep(5000);
		// close browser
		driver.close();
	
	}

}
