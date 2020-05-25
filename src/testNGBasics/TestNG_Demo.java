package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

/* 1.TestNG :Testing Next Generation framework.
 * 2. It has multiple interfaces , classes  and methods
 * 3.Advantages : default report 
 * 4. Annotations : @ for every annotation we have one method
 * 5. we can set priority also
 * 6. We also called as TDD framework :  Test Driven Development framework 
 * 
 * manual test step
 * 
 * 1. prerequiste : precondition
 * 2. open Brower 
 * 2. fb login app with valid credential or enter URL
 *      
 *      @Test  
 * 3. verify title FB
 * 4. Verify Email text available or not
 * 
 *Post Condition
 * 5. logout
 * 6. cookies delete 
 * 7. Close the Browser 
 
 *TC 1  Create Pairing for @BeforeMethod , @Test , @AfterMethod--Created 1 Pair
 *TC2:  Create Pairing for @BeforeMethod , @Test , @AfterMethod--created another pair
 *TC 3: Create Pairing for @BeforeMethod , @Test , @AfterMethod--created another pair
 *
 */
public class TestNG_Demo {
	
	//Precondition
	//@Before Suite(create java project) ,@BeforeTest(craete pckg) , @BeforeClass(create class) ,@BeforeMethod(before logci) @
	
	//@Test--where you write the Actual logic
	
	//Post Condition
	//@AfterMethod , @AfterClass, @AfterTest, @AfterSuite
	
	
	
	

	//Precondition
	@BeforeSuite
	public void setUp()
	{

		System.out.println("Setup Chrome Proerty");
		
	}
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("Login to App");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Before Method-Enter URL");
	}
	
	
	@Test
	public void TC1_verifyTitle()
	{
		System.out.println("Test Case 1--Test--Verify Title");
	}
	
	@Test
	public void Tc2_emailVerification()
	{
		System.out.println("Test Case 2--emailVerification");
	}

	
	@Test
	public void Tc3_passordVerification()
	{
		System.out.println("Test Case 3--PassoerdVerification");
	}
	//Post Condition
	
	
	@AfterMethod
	
	public void logOut()
	{
		System.out.println("After Method--LogOut the App");
	}
	
	
	
	@AfterClass
	
	public void deleteCookies()
	{
		System.out.println("Delete Cokkies");
		
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	/*@AfterSuite
	public void report()
	{
		System.out.println("Generate Report");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
