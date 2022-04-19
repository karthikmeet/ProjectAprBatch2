package org.pageexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends extends Basic {

	@Test
	public void method3()
	{
		System.out.println("method3");
		Assert.assertTrue(3<2);
	}
	
	@Test(dependsOnMethods = {"method3", "method2"})
	public void method1()
	{
		System.out.println("method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("method2");
	}
}
