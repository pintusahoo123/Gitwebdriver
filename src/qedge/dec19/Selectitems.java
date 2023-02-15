package qedge.dec19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectitems {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		// store list box select class
	    Select element = new Select (driver.findElement(By.id("searchDropdownBox")));
	    // verify list box is in single or multiselection
	    boolean value = element.isMultiple();
	    System.out.println(value);
	    // select item in list box
	    element.selectByVisibleText("Musical Instruments");
	    Thread.sleep(1000);
	    // select item in list box by index method
	    element.selectByIndex(10);
	    System.out.println(element.getFirstSelectedOption().getText());
	    Thread.sleep(1000);
	    driver.quit();
	    
	    
	    
	}

}
