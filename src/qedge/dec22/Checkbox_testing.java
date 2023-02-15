package qedge.dec22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebAssert;

public class Checkbox_testing {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("file:///C:/checkbox_1.html");
		Thread.sleep(5000);
		// get collection of checkboxes
		List<WebElement> all_checkbox = driver.findElements(By.tagName("input"));
		System.out.println("no  of checkbox is"+all_checkbox.size());
		for (WebElement each : all_checkbox) {
			// verify each checkbox is selected or not
			boolean value = each.isSelected();
			// print each checkbox name
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname +"      "+value);
			Thread.sleep(4000);
			each.click();
			
			
			
		}

	}

}
