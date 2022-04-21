package org.pageexecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{

	int min = 0;
	int max = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(min<max)
		{
			min++;
			return true;
		}		
		return false;
	}
}


// 0<3
// 1<3
// 2<3
