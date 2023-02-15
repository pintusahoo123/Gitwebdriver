package qedge.dec28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Each_table_data2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		// get row collection
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("no of rows are"+rows.size());
		for (WebElement eachrow : rows) {
			// get cell collection in each row
			List<WebElement> column = eachrow.findElements(By.tagName("td"));
			// iterate each cell in a row 
			for (WebElement eachcell : column) {
				String celldata = eachcell.getText();
				System.out.print(celldata+"\n");       // \n is used for new line

			}
			System.out.println();
			System.out.println("-----------------------------------");
			Thread.sleep(1000);
		}
		Thread.sleep(4000);
		driver.close();

	}

}
