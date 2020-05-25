package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBtest {
	
WebDriver driver;

@BeforeMethod
	
	public void setUp()
	{
	
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
	}

	@Test
	
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void labelVerification()
	{
		boolean b=driver.findElement(By.xpath("//label[@for='pass123']")).isDisplayed();
		System.out.println(b);
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
