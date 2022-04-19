package org.pageexecution;

import org.testng.annotations.Test;

public class Basic {
	
	@Test(priority = 5)
	public void test() {
		System.out.println("test 5");
	}
	
	@Test(priority = -5)
	public void test3() {
		System.out.println("test -5");
	}
	
	@Test(priority = -20)
	public void testa() {
		System.out.println("test -20");
	}
	
	@Test(priority = 3)
	public void test1() {
		System.out.println("test 3");
	}
}
