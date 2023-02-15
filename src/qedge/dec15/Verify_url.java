package qedge.dec15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url {
	public static void main(String[] args) throws Throwable {
		// to verify given url is secured or not
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured ::"+Expected+" = "+Actual);
		}
		else
		{
			System.out.println("url is not secured ::"+Expected+ " ~ "+Actual);
		}
		driver.close();
		
		
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.com/");
		Thread.sleep(5000);
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured ::"+Expected+" = "+Actual);
		}
		else
		{
			System.out.println("url is not secured ::"+Expected+ " ~ "+Actual);
		}
		driver.close();*/
	}

}
