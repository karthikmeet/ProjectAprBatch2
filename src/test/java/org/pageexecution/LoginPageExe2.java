package org.pageexecution;

import org.baseutil.BaseClass;
import org.pagerepo.LoginPageRepo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageExe2 extends BaseClass {

		@Parameters({"data"})
		@BeforeMethod
		public void beforeMethod(String data) {
			driver.get(data);
		}

		@Test(dataProvider = "testdata", dataProviderClass = LoginPageExe.class)
		public void method(String username, String password, int sno) {
			LoginPageRepo lp = new LoginPageRepo();
			lp.getUsername().sendKeys(username);
			lp.getPassword().sendKeys(password);
			System.out.println(sno);
		}
}
