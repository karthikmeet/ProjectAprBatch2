package org.pageexecution;

import org.testng.annotations.Test;

public class Invoke {

	
	@Test(invocationCount = 10)
	public void multiple() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("test");
	}
}
