package dddframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class DataProviderWithExcel
{
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
	@DataProvider(name="login")
	
	public Object[][] getData()
	{
		ExcelDataConfig excel=new ExcelDataConfig("D:\\Selenium\\Excel Data\\TestData.xlsx");
		int rows=excel.getRow(0);
	
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=excel.getData(0, i, 0);
			data[i][1]=excel.getData(0,i,1);
		}
		return data;
		
	}

}
