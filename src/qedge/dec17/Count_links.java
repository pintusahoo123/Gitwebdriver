package qedge.dec17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_links {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		// get collections of links in webpage which are stored in html tag a
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("no of links are = "+all_links.size());
		/*for  (int i=0; i<all_links.size(); i++)
		{
			// get each link text
			String link_name = all_links.get(i).getText();
			Thread.sleep(500);
			System.out.println(link_name);
			String link_url = all_links.get(i).getAttribute("href");
			System.out.println(link_url);
		}
		driver.quit();*/
		for (WebElement each : all_links) {
			System.out.println(each.getText());
			Thread.sleep(1000);
			
			
		}
		
	}

}
