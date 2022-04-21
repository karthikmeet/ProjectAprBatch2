package org.pageexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailures {

	@Test
	public void test3() {
		System.out.println("This test will Pass");
		Assert.assertTrue(true);
	}

	@Test
	public void test4() {
		System.out.println("This test will Fail");
		Assert.assertTrue(false);
	}
}