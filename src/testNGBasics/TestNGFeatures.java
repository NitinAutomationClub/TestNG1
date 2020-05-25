package testNGBasics;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(priority=2)
	public void TC1()
	{
		System.out.println("TC1");
	}

	
	@Test(priority=3)
	public void TC2()
	{
		System.out.println("TC2");
	}
	@Test(priority=1)
	public void TC3()
	{
		System.out.println("TC3");
	}
	
	@Test
	public void A()
	{
		System.out.println("A method");
	}
	@Test
	public void B()
	{
		int a=10/0;
		System.out.println("B method");
		
	}
}
