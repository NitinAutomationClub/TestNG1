package testNGBasics;

import org.testng.annotations.Test;

public class TestNGException {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void cal()
	{
		System.out.println("1");
		int a=10/0;
		System.out.println(a);
		System.out.println("2");
	}

}
