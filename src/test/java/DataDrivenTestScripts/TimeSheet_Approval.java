package DataDrivenTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenPom.EnterTimeSheet;
import DataDrivenPom.Login;
import DataDrivenUtilities.CommonUtil;

public class TimeSheet_Approval extends TestCore{
	
	WebDriver Driver=null;
	Login ln = new Login();
	EnterTimeSheet et = new EnterTimeSheet();
	Common tc = new Common();
	CommonUtil mt = new CommonUtil();
	public By Home    = By.xpath("//span[contains(text(),'HomePage')]");
	public By Module  = By.xpath("//a[@title='Modules']");
	public By Time    = By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]");
	public By Manager = By.xpath("//ul[@id='sidebarnav']//li[3]//a[1]//span");
	public By Approval= By.xpath("//a[contains(text(),'Approve Timesheet')]");
	public By FromDate=By.xpath("//input[@name='fromdate']");
	public By ToDate  =By.xpath("//input[@name='todate']");
	public By Associate =By.xpath("//select[@name='associate']");
	public By Search     =By.xpath("//button[@id='owsearchExpenses']");
	public By SellectAll =By.xpath("//input[@id='checkAll']");
	public By Sellect1   =By.xpath("//input[@id='check00']");
	public By Approve    =By.xpath("//button[contains(text(),'Approve')]");
	public By Yes_plz    =By.xpath("//button[@id='owapproveTimesheets']");
	public By Close      = By.xpath("//html//body//app-root//app-success-blog//div//div//div//div[3]//button");
	public By Reject     =By.xpath("//button[contains(text(),'Reject')]");
	public By TextArea    =By.xpath("//textarea[@name='pmComments']");
	public By Yes_Plz_Rjct =By.id("owrejectTimesheets");

	@Test(priority=0 , enabled=false)
	public void EmterTimeSheet() throws InterruptedException {
		//ln.LoginWithInvalidCredentials();
		et.EnterTimeSheetData();
		 et.Logout();
	}
	
	
	
	@Test(priority=1 , enabled=false)
	public void Aproval() throws InterruptedException {
	
		//WebDriver Driver = null;
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			tc.waitAndClick(Home);
			Thread.sleep(1000);
			tc.Click(Module);
			tc.waitAndClick(Time);
			Thread.sleep(1000);
			tc.waitAndClick(Manager);
			Thread.sleep(1000);
			tc.waitAndClick(Approval);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(1000);
			WebElement elm = driver.findElement(Associate);
			Select slc = new Select(elm);
			slc.selectByVisibleText("Vamsi Gundla");
			Thread.sleep(1000);
			tc.Click(Search);
			//tc.Click(SellectAll);
			Thread.sleep(1000);
			tc.Click(Sellect1);
			Thread.sleep(1000);
			tc.Click(Approve);
			Thread.sleep(1000);
			tc.Click(Yes_plz);
			Thread.sleep(1000);
			mt.ClickByXpath(Close);
	}
	      @Test(priority=2,enabled=false)
		public void TimeSheet_ApprovalReject() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	  Thread.sleep(1000);
		    tc.waitAndClick(Manager);
		    Thread.sleep(1000);
			tc.waitAndClick(Approval);
			Thread.sleep(4000);
			WebElement elm = driver.findElement(Associate);
			Select slc = new Select(elm);
			slc.selectByVisibleText("Vamsi Gundla");
			//tc.Click(SellectAll);
			Thread.sleep(1000);
			tc.Click(Sellect1);
			Thread.sleep(1000);
			tc.Click(Reject);
			Thread.sleep(1000);
			tc.EnterText(TextArea,"Text");
			Thread.sleep(1000);
			tc.Click(Yes_Plz_Rjct);
			Thread.sleep(1000);
			mt.ClickByXpath(Close);
			 
		}
	      

        @AfterTest(enabled=false)
        public void Logout() throws InterruptedException {
	    et.Logout();
}

}
