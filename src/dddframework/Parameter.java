package dddframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	WebDriver driver;
	@Test
	
	@Parameters({"url","emailid","pswrd"})
	
	public void signIn(String url,String emailid,String pswrd)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.findElement(By.name("login")).sendKeys(emailid);
		driver.findElement(By.name("passwd")).sendKeys(pswrd);
		driver.findElement(By.name("proceed")).click();
	
	
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	}
}
