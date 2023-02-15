package qedge.dec28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Each_table_data {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://money.rediff.com/mutual-funds");
		 Thread.sleep(5000);
		 // store table into webelement
		 WebElement webtable = driver.findElement(By.className("dataTable"));
		 // get collection of rows in a table
		 List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		 // i want avoid 1st row
		 int allrows = rows.size()-1;
		 System.out.println( "no of rows are::: "+allrows);
		 // iterate all rows
		 for (int i=1; i<allrows; i++)
		 {
			 // get each row cell size
			 List<WebElement> colomns = rows.get(i).findElements(By.tagName("td"));
			 Thread.sleep(500);
			 System.out.println("row no:"+i+"      "+"column size ::"+colomns.size());
		 }
		 Thread.sleep(4000);
		 driver.close();

	}

}
