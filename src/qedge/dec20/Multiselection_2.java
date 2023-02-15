package qedge.dec20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection_2 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/MultiListboxHtmlpage.html");
		Thread.sleep(3000);
		Select dropdown  =  new Select(driver.findElement(By.name("multiSelection")));
		// vrrify list box is singe or multiselection
		boolean  value = dropdown.isMultiple();
		System.out.println(value);
		// selct 0 to  8 items
		for (int i=0; i<8; i++)
		{
			dropdown.selectByIndex(i);
			Thread.sleep(4000);
		}
		// get collection of items which are selected
		List<WebElement> selected_items = dropdown.getAllSelectedOptions();
		System.out.println("no of items selected ::"+selected_items.size());
		for (WebElement each : selected_items) {
			System.out.println(each.getText());
			Thread.sleep(3000);
			
		}
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
