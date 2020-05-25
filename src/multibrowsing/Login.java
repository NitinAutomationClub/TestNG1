package multibrowsing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Login {
WebDriver driver;
	@Test
	public void login() throws Exception
{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Selenium Prog1\\"
				+ "TestNGFrameWork\\src\\"
				+ "multibrowsing\\config.properties");
		
		//Connection establish
		prop.load(fis);
		//System.out.println(prop.getProperty("browser"));

		
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.out.println("Chrome");
			System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("firefox");
			System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
			
		}
		else if(browserName.equalsIgnoreCase("i.e"))
		{
			System.out.println("firefox");
			System.setProperty("webdriver.ie.driver", "c:\\driver\\iedriver.exe");
			driver=new InternetExplorerDriver();
			
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("user@123");
		driver.findElement(By.xpath(prop.getProperty("pass_xpath"))).sendKeys("Pass@123");
		
	}
	}

