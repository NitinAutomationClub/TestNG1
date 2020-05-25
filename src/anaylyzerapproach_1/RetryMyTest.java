package anaylyzerapproach_1;

import org.testng.Assert;
import org.testng.annotations.Test;

/*Approaches
 * 1. Test time
 * 2. Run Time
 * 
 * 
 */
public class RetryMyTest {
	
	@Test
	public void TC1()
	{
		
		String s1="Google";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}
	
	@Test(retryAnalyzer=anaylyzerapproach_1.RetryAnalyzer.class)
	public void TC2()
	{
		
		String s1="abc";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}

}
