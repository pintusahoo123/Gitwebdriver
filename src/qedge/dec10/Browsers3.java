package qedge.dec10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //it maximize chrome window screen
		driver.manage().deleteAllCookies();  // it deleted all opened windows
		
		// launch url
		driver.get("http://google.com");
		driver.close();
		
		
	}

}
