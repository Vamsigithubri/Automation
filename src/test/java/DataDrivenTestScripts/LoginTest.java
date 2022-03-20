package DataDrivenTestScripts;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenPom.Login;
import DataDrivenTestData.TestData;
import DataDrivenUtilities.CommonUtil;

public class LoginTest extends TestCore {
	
	Login ln = new Login();
	
	@Test(priority=1,enabled=false)
	public void Login_QA_WithBlankValue() {
		try {
			ln.LoginWithBlankValues();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Login Failed With Blank Values !!");
	}
	@Test(priority=2,enabled=false)
	public void Login_QA_INValidCredentails()   {
		try {
			ln.LoginWithValidCredentails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Login Failed with Invalid Values!!");
	}
	
	@Test(priority=3,enabled=true)
	public void Login_QA_ValidCredentails() throws InterruptedException  {
		
		ln.LoginWithValidCredentails();
		Reporter.log("Successfully Login In TimeSheet !!");
	
	}
	

}