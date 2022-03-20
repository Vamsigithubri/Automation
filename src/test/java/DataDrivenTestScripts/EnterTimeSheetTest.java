package DataDrivenTestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenPom.EnterTimeSheet;
import DataDrivenPom.Login;
import DataDrivenTestData.TestData;
import DataDrivenUtilities.CommonUtil;

public class EnterTimeSheetTest extends TestCore {
	Login ln = new Login();
	EnterTimeSheet et = new EnterTimeSheet();
	
	@Test(priority=1 , enabled=false)
	public void VerifyEnterTimeSheetTitles() throws InterruptedException {
	et.VerifyEnterTimeSheetTitles();
		
	}
	
	@Test(priority=2 , enabled = true)
	public void EnterTimeSheet_EnterData() throws Exception   {
		et.EnterTimeSheetData();
		
	}
	     
	    @Test(priority=3, enabled=true)
	    public void EnterTimeSheet_EnterData1() throws InterruptedException {
	    	et.EnterTimeSheetData1();
	 }
	    @AfterTest(enabled=false)
	    public void Logout() throws InterruptedException {
	    	et.Logout();
	  }
	
}