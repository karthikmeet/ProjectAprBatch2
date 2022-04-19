package org.pageexecution;

import org.baseutil.BaseClass;
import org.pagerepo.LoginPageRepo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageExe extends BaseClass {

	@Parameters({"data"})
	@BeforeMethod
	public void beforeMethod(String data) {
		driver.get(data);
	}

	@Test(dataProvider = "testdata")
	public void method(String username, String password, int sno) {
		LoginPageRepo lp = new LoginPageRepo();
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		System.out.println(sno);
	}
	
	@DataProvider
	public Object[][] testdata()
	{
		return new Object[][] {
			{"Anandh","Project Apr 2", 1},
			{"Yaswanth","Project Apr 2", 2},
			{"Karthick","Project Apr 2", 3},
			{"Lakshman","Project Apr 2", 4},
			{"Preethi","Project Apr 2", 5}
		};
	}
}
