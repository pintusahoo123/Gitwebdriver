package qedge.dec29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_orangehrm_table {

	public static void main(String[] args) throws Throwable {
		String employee_name ="Ram Singh";
		boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		WebElement webtable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("no of rows are = "+rows.size());
		Thread.sleep(4000);
		for (int  i=1; i<rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j=0; j<cols.size(); j++)
			{
				String celldata = cols.get(j).getText();
				Thread.sleep(100);
				System.out.print(celldata+"\n");
				if(celldata.equalsIgnoreCase(employee_name))
				{
					item_exist= true;
					System.out.println(employee_name+"       "+"found in no ="+i+"              "+"colomn no ="+(j+1));
					break;
				}
			}
			System.out.println("===================================");
		}
		if(item_exist) {
			System.out.println(employee_name+"               "+"found in table");
			
		}
		else
		{
			System.out.println(employee_name+"               "+"not found in table");
		}
		driver.close();
		
		
		

	}

}
