package org.pageexecution;

import org.testng.annotations.Test;

public class Description {
	
	@Test(description = "addition of two numbers 5 and 2")
	public void add()
	{
		int a = 5;
		int b = 2;
		int c;
		c = a+b;
		System.out.println(c);
	}

}
