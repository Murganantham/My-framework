package testcase;

import org.testng.annotations.Test;

import baseclass.Base;
import pages.home;

public class Logout extends Base {
	
	@Test(groups= {"Sanity"})
	public void Testcase2() {
		
		home hb=new home();
		hb.homepage();
		
		
	}

}
