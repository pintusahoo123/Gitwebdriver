package qedge.dec15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_title {

	public static void main(String[] args) throws Throwable {
		// to verify expected title with actual title
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		String Expected_title = "google";
		String Actual_title =driver.getTitle();
		// verify expected title with actual title
		if (Expected_title.equalsIgnoreCase(Actual_title))
		{
			System.out.println("title is matching ::" +Expected_title+"  "+Actual_title);
			
		}
		else
		{
			System.out.println("title is not matching ::"+Expected_title +"   "+Actual_title);
		}
		driver.close();
		
		
		
		    
				/*WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.amazon.com/");
				Thread.sleep(4000);
				String Expected_title = "google";
				String Actual_title =driver.getTitle();
				// verify expected title with actual title
				if (Expected_title.equalsIgnoreCase(Actual_title))
				{
					System.out.println("title is matching ::" +Expected_title+"  "+Actual_title);
					
				}
				else
				{
					System.out.println("title is not matching ::"+Expected_title +"   "+Actual_title);
				}
				driver.close();*/
				
	}

}
