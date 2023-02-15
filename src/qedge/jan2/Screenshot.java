package qedge.jan2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://facebook.com");
		 Thread.sleep(5000);
		 // java time stamp
		 Date dt = new Date();
		 DateFormat df = new SimpleDateFormat("YYYY_MM_dd");
		 String datef = df.format(dt);
		 // take screenshot and store into variable
		 File sshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // copy screenshot into local system
		 FileUtils.copyFile(sshot, new File("D:/screenshot/"+datef+"homepage.png"));
		 driver.close();
		 

	}

}
