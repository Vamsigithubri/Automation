package DataDrivenTestScripts;


import org.testng.annotations.Test;

import DataDrivenCore.TestCore;
import DataDrivenPom.EnterTimeSheet;
import DataDrivenPom.Login;


public class LoginTest1 extends TestCore {

	EnterTimeSheet et = new EnterTimeSheet();
	Login Lg = new Login();
	
	   @Test(priority=1, enabled=true)
	    public void EnterTimeSheet_EnterData() throws InterruptedException {
	    	Lg.LoginWithValidCredentails1();
	
	    	et.EnterTimeSheetData();
	 }

}
