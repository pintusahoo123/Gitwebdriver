package qedge.dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Writing_xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input)[9]")).sendKeys("pintu");
        driver.findElement(By.xpath("(//input)[10]")).sendKeys("sahoo");
        driver.findElement(By.xpath("(//input)[11]")).sendKeys("pintusahoo516@mail.com");
        driver.findElement(By.xpath("(//input)[12]")).sendKeys("pintusahoo516@mail.com");
        driver.findElement(By.xpath("(//input)[13]")).sendKeys("pintusahoo1244");
        driver.findElement(By.xpath("(//form[@id='reg']//following::select)[1]")).sendKeys("24");
        driver.findElement(By.xpath("(//form[@id='reg']//following::select)[2]")).sendKeys("nov");
        driver.findElement(By.xpath("(//form[@id='reg']//following::select)[3]")).sendKeys("1947");
        driver.findElement(By.xpath("(//form[@id='reg']//following::input)[10]")).click();
        driver.findElement(By.xpath("(//form[@id='reg']//following::button)[1]")).click();
        Thread.sleep(2000);
        driver.close();
        
        
        /*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input)[9]")).sendKeys("pintu");
        driver.findElement(By.xpath("(//input)[10]")).sendKeys("sahoo");
        driver.findElement(By.xpath("(//input)[11]")).sendKeys("pintusahoo516@mail.com");
        driver.findElement(By.xpath("(//input)[12]")).sendKeys("pintusahoo516@mail.com");
        driver.findElement(By.xpath("(//input)[13]")).sendKeys("pintusahoo1244");
        new Select(driver.findElement(By.xpath("(//form[@id='reg']//following::select)[1]"))).selectByIndex(23);
        new Select(driver.findElement(By.xpath("(//form[@id='reg']//following::select)[2]"))).selectByVisibleText("nov");
        new Select(driver.findElement(By.xpath("(//form[@id='reg']//following::select)[3]"))).selectByVisibleText("1947");
        driver.findElement(By.xpath("(//form[@id='reg']//following::input)[10]")).click();
        driver.findElement(By.xpath("(//form[@id='reg']//following::button)[1]")).click();
        Thread.sleep(2000);
        driver.close();*/
	}

}
