package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TypesofAssert {
	@Test
	public void verification()
	{
	String actual="Google";
	String expected="Gooooooooooogle";
	
	System.out.println("Test Case Started");
	
	Assert.assertEquals(actual, expected," Title is not matching");
	
	System.out.println("Test Case END");

}
	@Test
	public void testSoftAssert()
	{
		SoftAssert assertion=new SoftAssert();
		
		String actual="Google";
		String expected="Gooooooooooogle";
		
		System.out.println("Test Case Started");
		
		assertion.assertEquals(actual,expected,"Title is Not Matching");
		
		System.out.println("Test Case END");
		
		assertion.assertAll();
		
	}
	
}