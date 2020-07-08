package testcase;

import org.testng.annotations.Test;

import baseclass.Base;
import pages.Login;

public class logintest extends Base {
	
	@Test(groups = { "smokeTest" })
	public void testcase1() throws InterruptedException {		
		smbase();
		Login ab = new Login();		
		ab.logpage();
		driver.quit();
	}

}
