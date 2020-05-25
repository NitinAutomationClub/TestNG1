package testNGBasics;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups="fb")
	public void loginScreen()
	{
		System.out.println("TC1");
	}

	
	@Test(groups="fb")
	public void homeScreen()
	{
		System.out.println("TC2");
	}
	@Test(groups="email")
	public void composeEmail()
	{
		System.out.println("TC3");
	}
	
	@Test
	public void welcomePage()
	{
		System.out.println("A method");
	}
	@Test(groups="email")
	public void sendEmail()
	{
		
		System.out.println("B method");
		
	}


}
