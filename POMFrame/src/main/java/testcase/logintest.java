package testcase;

import org.testng.annotations.Test;

import baseclass.Base;
import pages.Login;

public class logintest extends Base {

	@Test(groups = { "smokeTest" })
	public void testcase1() throws InterruptedException {
		Login ab = new Login();
		smbase();

		ab.logpage();

	}

}
