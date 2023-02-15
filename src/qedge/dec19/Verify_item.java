package qedge.dec19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_item {
	public static void main(String[] args) throws Throwable {
		String item_present ="deals";
		boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		Select element =  new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = element.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			String actual_item = each.getText();
			System.out.println(actual_item);
			Thread.sleep(3000);
			// verify item presnt is equal to actual item
			if (actual_item.equalsIgnoreCase(item_present))
			{
				item_exist=true;
				break;
				
			}
			
		}
		if (item_exist)
		{
			System.out.println("item found in listbox == "+item_present);
		}
		else
		{
			System.out.println("item not found in listbox == "+item_present);
		}
		driver.quit();
		
		
		
		
	}

}
