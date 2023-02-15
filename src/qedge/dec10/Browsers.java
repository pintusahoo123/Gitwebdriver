package qedge.dec10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	// creating instance object for chrome

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  

	}

}
