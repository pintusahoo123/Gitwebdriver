package qedge.dec20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/MultiListboxHtmlpage.html");
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		// verify list box is single or multi selection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		// select item from 0  to 10
		for (int i=0; i<12; i++)
		{
			dropdown.selectByIndex(i);
			Thread.sleep(3000);
		}
		// then  deselect 0 to 10
		dropdown.deselectByIndex(2);
		Thread.sleep(2000);
		dropdown.deselectByIndex(5);
		Thread.sleep(2000);
		dropdown.deselectByIndex(9);
		Thread.sleep(2000);
		dropdown.deselectAll();
		Thread.sleep(4000);
		driver.close();
			
			
		}
		
		
	}


