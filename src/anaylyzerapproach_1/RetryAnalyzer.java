package anaylyzerapproach_1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer

{
	 int counter=0;
	int retryLimlit=3;
	
	public boolean retry(ITestResult result)
	{
		if(counter<retryLimlit)
		{
			counter++;
			return true;//it execute the retry concept/logic
		}
		
		return false;
	}

	
	

}
