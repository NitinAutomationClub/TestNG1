package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsertionsDemo {

	@Test
	public void verification()
	{
	String actual="Google";
	String expected="Goooooooooogle";
	
	Assert.assertEquals(actual, expected," Title is not matching");
	
	
	}
	


}
