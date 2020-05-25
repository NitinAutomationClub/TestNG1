package testNGBasics;

import org.testng.annotations.Test;

public class TestNGDepends {
	
	@Test
	public void loginScreen()
	{
		
		System.out.println("TC1");
	}

	
	@Test(dependsOnMethods="loginScreen")
	public void homeScreen()
	{
		int i=10/0;
		System.out.println("TC2");
	}

	@Test(dependsOnMethods={"loginScreen","homeScreen"})
	public void welcomeScreen()
	{
		System.out.println("TC3");
	}

	

}
