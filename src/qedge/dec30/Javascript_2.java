package qedge.dec30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jvex = (JavascriptExecutor)driver;
		jvex.executeScript("window.location='https://amazon.in'");
		Thread.sleep(4000);
		// scroll top to button vertically 
		jvex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		// scroll button to top
		jvex.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(4000);
		//scroll to certain pixel
		jvex.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
