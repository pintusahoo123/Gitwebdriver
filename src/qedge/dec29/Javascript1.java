package qedge.dec29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.amazon.in/'");
		Thread.sleep(4000);
		// print  title and length of title
		String pagetitle =js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		//print domain name and length of domain
		String strdomain  = js.executeScript("return document.domain").toString();
		System.out.println(strdomain);
		System.out.println(strdomain.length());
		driver.close();
		
		
	}

}
