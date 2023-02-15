package qedge.dec15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {
	public static void main(String[] args) throws Throwable {
		// write a script to print title and url along with length
		System.setProperty("Webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		// print title and length
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle); // print page title of the link
		System.out.println(pagetitle.length()); // print title length
		// print url and length of url
		String strurl =driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.close();
		
		
	}

}
