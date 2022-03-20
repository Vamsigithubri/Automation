package DataDrivenPom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenTestData.TestData;
import DataDrivenUtilities.CommonUtil;

public class Login extends TestCore{
	Common cmn = new Common();
	CommonUtil cmnu = new CommonUtil();
	public By ClickHere = By.xpath("//strong[contains(text(),' Click Here  ')]");
	public By SignWithOutlook = By.xpath("//span[contains(text(),'Sign in with outlook')]");
	public By username = By.xpath("username");
	public By Next = By.xpath("password");
	public By password = By.xpath("password");
	public By login = By.xpath("login");
	public By username_QA = By.xpath("//input[@name='email']");
	public By password_QA = By.xpath("//input[@name='password']");
	public By loginButton_QA = By.xpath("//button[contains(text(),'login')]");
	public By EnterTimeSheet_QA = By.xpath("//div[@class='login-page']//div//form//div//div//a[1]//span");
	public By HomePage_QA = By.xpath("//div[@class='login-page']//div//form//div//div//a[2]//span");
	public By OneWaveTitles = By.xpath("//html//body//app-root//login-page//div//div//form//p[1]");
	public By Signin = By.xpath("//html//body//app-root//login-page//div//div//form//div[1]//div//div//span");
	public By SigninWithOutlook = By.xpath("//html//body//app-root//login-page//div//div//form//div[1]//div//a//span");
	
	public void LoginWithBlankValues() throws InterruptedException
	{	
		Thread.sleep(1000); 
		cmn.Click(ClickHere);
		cmn.EnterText(username_QA, TestData.LoginTestData.username);
		cmn.EnterText(password_QA, TestData.LoginTestData.password);
		cmnu.ClickByXpath(loginButton_QA);
		
	}
	
	public void LoginWithValidCredentails() throws InterruptedException
	{
		Thread.sleep(1000);
		cmn.Click(ClickHere); 
		cmn.EnterText(username_QA, TestData.LoginTestData.username);
		cmn.EnterText(password_QA, TestData.LoginTestData.password);
		cmnu.ClickByXpath(loginButton_QA);
	}
	
	public void LoginWithValidCredentails1() throws InterruptedException
	{
		
		Thread.sleep(1000);
		cmn.Click(ClickHere);
		cmn.EnterText(username_QA, TestData.LoginTestData.username1);
		cmn.EnterText(password_QA, TestData.LoginTestData.password);
		cmnu.ClickByXpath(loginButton_QA);
		
	}

}
