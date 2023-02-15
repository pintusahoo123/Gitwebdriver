package qedge.dec29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_table {

	public static void main(String[] args) throws Throwable {
		String country_present = "UK";
		boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(4000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.id("customers"));
		// get collection of rows in a table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		Thread.sleep(4000);
		for (int i=1; i<rows.size(); i++) {
			//get collection of colomn 
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j=0; j<cols.size(); j++) {
				String celldata = cols.get(j).getText();
				Thread.sleep(500);
				System.out.print(celldata+"\n" );              // for printing in new line
				//System.out.print(celldata+"\t" );  
				if(celldata.equalsIgnoreCase(country_present))
				{
					item_exist= true;
					System.out.println(country_present+"           "+"found in row no :: "+i+"         "+"column no ::"+(j+1));
					break;

				}
			}
			System.out.println("================================================");
		}
		if(item_exist) {
			System.out.println(country_present+"    "+"found in table");

		}
		else
		{
			System.out.println(country_present+"     "+"not found in table");
		}
		driver.close();



	}

}


