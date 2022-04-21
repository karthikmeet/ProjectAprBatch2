package org.pageexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailures {

	@Test(retryAnalyzer = RetryTest.class)
	public void test1() {
		System.out.println("This test will Pass");
		Assert.assertTrue(true);
	}

	@Test(retryAnalyzer = RetryTest.class)
	public void test2() {
		System.out.println("This test will Fail");
		Assert.assertTrue(false);
	}
}
