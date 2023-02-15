package qedge.dec10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser2 {

	public static void main(String[] args) {
		//creating instance object for fire fox
		System.setProperty("Webdriver.gecko.driver", "c:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
