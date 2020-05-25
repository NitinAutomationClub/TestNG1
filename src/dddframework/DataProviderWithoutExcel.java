package dddframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderWithoutExcel {
	
	
	WebDriver driver;
	
	@Test(dataProvider="login")
	public void signIn(String user, String pswd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys(user);
		driver.findElement(By.name("passwd")).sendKeys(pswd);
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
	
	
	}

	
@AfterMethod()
public void closeBrowser()
{
	driver.quit();
}

@DataProvider(name="login")
public Object[][] getData()
{
	
	Object[][] data=new Object[3][2];
	data[0][0]="admin1";
	data[0][1]="pswd1";
	data[1][0]="testceo";
	data[1][1]="Test@1234";
	data[2][0]="guest";
	data[2][1]="guestpassword";
	
	return data;
	
	
	
}
}

