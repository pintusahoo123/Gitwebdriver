package qedge.dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRagandDropBy_method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		// switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		int x = destination.getLocation().getX();       // x  co-ordinates always vertical
		int y = destination.getLocation().getY();       // y co-ordinates always horizontal
		System.out.println(x+"     "+y);
		ac.dragAndDropBy(source, x, y).perform();
		Thread.sleep(5000);
		driver.close();



	}

}
