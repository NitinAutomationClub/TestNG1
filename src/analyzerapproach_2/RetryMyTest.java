package analyzerapproach_2;

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
		
		String s1="abccccs";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}
	
	@Test
	public void TC2()
	{
		
		String s1="abc";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}
	@Test
	public void TC3()
	{
		
		String s1="abc";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}
	@Test
	public void TC4()
	{
		
		String s1="Google";
		String s2="Google";
		
		Assert.assertEquals(s1, s2);
		
	}
}
