package DataDrivenPom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenUtilities.CommonUtil;

public class EnterTimeSheet extends TestCore{
	//WebDriver driver;
	Common cmn = new Common();
	CommonUtil cmnu = new CommonUtil();
	public By ClickHere = By.xpath("//strong[contains(text(),' Click Here  ')]");
	public By username_QA = By.xpath("//div[@class='login-page']//div//form//div[3]//input[1]");
	public By password_QA = By.xpath("//div[@class='login-page']//div//form//div[3]//input[2]");
	public By loginButton_QA = By.xpath("//button[contains(text(),'login')]");
	public By Button = By.xpath("//div[@class='col-xs-12']//div//div//div[2]//div//button[1]//i");
	public By Button1 = By.xpath("//div[@class='col-xs-12']//div//div//div[2]//div//button[2]//i");
	public By EnterTimeSheet_QA = By.xpath("//div[@class='login-page']//div//form//div//div//a[1]//span");
	public By HomePage_QA = By.xpath("//div[@class='login-page']//div//form//div//div//a[2]//span");
	public By Close      = By.xpath("//html//body//app-root//app-success-blog//div//div//div//div[3]//button");
	public By Pluss = By.xpath("//div[@class='table-responsive']//table//tbody[2]//tr//td[11]//button//i");
	
	public void VerifyEnterTimeSheetTitles() throws InterruptedException {
		Thread.sleep(1000);
		//cmn.Click(ClickHere);
		//cmn.EnterText(username_QA, TestData.username);
		//cmn.EnterText(password_QA, TestData.password);
		Thread.sleep(1000);
		//cmn.Click(loginButton_QA);
		Thread.sleep(1000);
		//cmn.Click(By.xpath("//span[contains(text(),'HomePage')]"));
		cmn.Click(By.xpath("//span[contains(text(),'Enter Timesheet')]"));
		Thread.sleep(1000);
		//cmn.Click(By.xpath("//a[@class='nav-link dropdown-toggle text-muted waves-effect waves-dark m-t-5']"));
		Thread.sleep(1000);
		//cmn.Click(By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]"));
		Thread.sleep(1000); 
	     //cmn.Click(By.xpath("//a[@class='has-arrow']"));
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'Attach Time')]")).click();
		//cmn.Click(By.xpath("//a[contains(text(),'Enter Time')]"));
		Thread.sleep(1000);
		String ActualText = cmn.GetText(By.xpath("//b[contains(text(),'Timesheet will be unlocked automatically on 25th of every month to 3rd of next month.')]"));
		System.out.println(ActualText);
		String ExpectedText = "Timesheet will be unlocked automatically on 25th of every month to 3rd of next month.";
		//Assert.assertEquals(ActualText, ExpectedText);
		
		String ActualText4 = driver.findElement(By.xpath("//b[contains(text(),'Note ')]")).getText();
		System.out.println(ActualText4);
		String ExpectedText4 = "Note ";
		
		String ActualText5 = driver.findElement(By.xpath("//button[contains(text(),'Copy Timesheet From previous Week')]")).getText();
		System.out.println(ActualText5);
		String ExpectedText5 = "Copy Timesheet From previous Week";
		//Assert.assertEquals(ActualText5, ExpectedText5);
		
		String ActualText6 = driver.findElement(By.xpath("//h3[contains(text(),'Weekly Timesheet')]")).getText();
		System.out.println(ActualText6);
		String Expectedtext6="Weekly Timesheet";
		//Assert.assertEquals(ActualText6, Expectedtext6);
		
		String ActualText7 = driver.findElement(By.xpath("//html//body//app-root//app-quickweeklytimesheet//div//div//div[1]//div//div//div//div[2]//div[1]//span")).getText();
		System.out.println(ActualText7);
	}
  
   public void VerifyEnterTimeSheetTableTitles() throws Exception {
	
	Thread.sleep(1000);
	List<WebElement>  elm = driver.findElements(By.xpath("//div[@class='table-responsive']//table//thead//tr//th"));
	String Columns = elm.get(1).getText();
	String ExColumn = "Date";
	Assert.assertEquals(Columns, ExColumn);
	int len = elm.size();
	System.out.println(len);
	for(int i=1; i<len; i++)
	{
		String ar[] = new String[len];
		ar[i] = elm.get(i).getText();
		
		String ar2[] = {"Date","ΣHours","Project/WO","Task","Sub Task","Hours","Remarks","Status","Manager Remarks",""};
		
		if(ar[i].equalsIgnoreCase(ar2[i-1]))
		{
			
			System.out.println("Columns name i Equal");
			System.out.println("Expected Column: "+ ar2[i-1]+ " and Actual Colunm: " + ar[i]);
		}
		
		else
		{
			System.out.println("Columns name is NOT Equal");
			System.out.println("Expected Column: "+ ar2[i-1]+ " and Actual Column: " + ar[i]);
			throw new Exception();	
	}}}
   
 public void EnterTimeSheetData() throws InterruptedException {
	   Thread.sleep(1000);
	   cmn.Click(By.xpath("//span[contains(text(),'Enter Timesheet')]"));
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       Thread.sleep(30000);
       SelectProject(1,"OneWave / jsjsjjsj");	
       SelectTask(1,"Others");
       SelectSubTask(1,"R and D");
       EnterHours(1,"8");
       EnterRemarks(1,"Testing Time Module");
       
       SelectProject(2,"OneWave / jsjsjjsj");	
	   SelectTask(2,"Others");
	   SelectSubTask(2,"R and D");
	   EnterHours(2,"2");
	   EnterRemarks(2,"Testing Time Module");	  
       
       
       SelectProject(3,"OneWave / jsjsjjsj");	
       SelectTask(3,"Others");
       SelectSubTask(3,"R and D");
       EnterHours(3,"8");
       EnterRemarks(3,"Integration Testing ");
       
   
       SelectProject(4, "OneWave / jsjsjjsj");	
       SelectTask(4, "Others");
       SelectSubTask(4, "R and D");
       EnterHours(4, "5");
       EnterRemarks(4, "Integration Testing ");
       
   
       SelectProject(5,"OneWave / jsjsjjsj");	
       SelectTask(5,"Others");
       SelectSubTask(5,"R and D");
       EnterHours(5,"8");
       EnterRemarks(5,"Testing Time Module");
       
         cmn.Click(Pluss);
		
		  cmn.SelectProject(2,2,"OneWave / jsjsjjsj");	
	      cmn.SelectTask(2,2,"Others");
		  cmn.SelectSubTask(2,2,"R and D");
		  cmn.EnterHours(2,2,"3");
		  cmn.EnterRemarks(2,2,"Testing Time Module");
		         
       Thread.sleep(1000);
      cmn.Click(By.id("owsaveweeklytimesheetDraft"));
      
	     Thread.sleep(1000);
	     cmn.Click(Close);
	     //submitt
  	    Thread.sleep(1000);
         cmn.waitAndClick(By.xpath("//button[@id='owsaveweeklytimesheetSubmit']"));
         //confirm submitt 
         Thread.sleep(2000);
         cmn.waitAndClick(By.xpath("//button[@id='owsubmitweeklytimesheet']"));
          //Close
         cmnu.ClickByXpath(By.xpath("//html//body//app-root//app-success-blog//div//div//div//div[3]//button"));
      
      driver.get("https://onewaveqa.techwave.net/#/home");
      Thread.sleep(1000);
  	//cmnu.ClickByXpath(By.xpath("//a[@class='nav-link dropdown-toggle text-muted waves-effect waves-dark m-t-5']"));
  	Thread.sleep(1000);
  //	cmnu.ClickByXpath(By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]"));
 }
  
   public void EnterTimeSheetData1() throws InterruptedException {
	   
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       Thread.sleep(30000);
       SelectProject(1,"OneWave / jsjsjjsj");	
       SelectTask(1,"Others");
       SelectSubTask(1,"R and D");
       EnterHours(1,"8");
       EnterRemarks(1,"Testing Time Module");
       
       Thread.sleep(1000);
       SelectProject(2,"Digital Buffer / Digital Buffer");	
       SelectTask(2,"Testing Phase - Automation");
       SelectSubTask(2,"IntegrationTest Script Execution");
       EnterHours(2,"8");
       EnterRemarks(2,"Integration Testing ");
       
       Thread.sleep(1000);
       SelectProject(3,"Digital Buffer / Digital Buffer");	
       SelectTask(3,"Testing Phase - Automation");
       SelectSubTask(3,"IntegrationTest Script Execution");
       EnterHours(3,"8");
       EnterRemarks(3,"Integration Testing ");
       
       Thread.sleep(1000);
       SelectProject(4, "Digital Buffer / Digital Buffer");	
       SelectTask(4, "Testing Phase - Automation");
       SelectSubTask(4, "IntegrationTest Script Execution");
       EnterHours(4, "5");
       EnterRemarks(4, "Integration Testing ");
       
       Thread.sleep(20000);
       SelectProject(5,"OneWave / jsjsjjsj");	
       SelectTask(5,"Others");
       SelectSubTask(5,"R and D");
       EnterHours(5,"8");
       EnterRemarks(5,"Testing Time Module");
       
      
       
       Thread.sleep(1000);
      cmn.Click(By.id("owsaveweeklytimesheetDraft"));
      
	     Thread.sleep(1000);
	     cmn.Click(Close);
	     //submitt
  	    Thread.sleep(1000);
         cmn.waitAndClick(By.xpath("//button[@id='owsaveweeklytimesheetSubmit']"));
         //confirm submitt 
         Thread.sleep(2000);
         cmn.waitAndClick(By.xpath("//button[@id='owsubmitweeklytimesheet']"));
          //Close
         cmnu.ClickByXpath(By.xpath("//html//body//app-root//app-success-blog//div//div//div//div[3]//button"));
      
      driver.get("https://onewaveqa.techwave.net/#/home");
      Thread.sleep(1000);
  	//cmnu.ClickByXpath(By.xpath("//a[@class='nav-link dropdown-toggle text-muted waves-effect waves-dark m-t-5']"));
  	Thread.sleep(1000);
  //	cmnu.ClickByXpath(By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]"));
      
      
  }
      private void SelectProject(int i, String value) {
 		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr//td[4]//span//select"));
 		Select slc = new Select(elm);
 		slc.selectByVisibleText(value);
 	}
 	
 	private void SelectTask(int i, String value) {
 		 WebElement elm = driver.findElement(By.xpath("//html//body//app-root//app-quickweeklytimesheet//div//div//div[1]//div//div//div//div[3]//table//tbody["+i+"]//tr//td[5]//span//select"));
 		Select slc = new Select(elm);
 		slc.selectByVisibleText(value);
 	}
 	
 	private void SelectSubTask(int i, String value) {
 		 WebElement elm = driver.findElement(By.xpath("//html//body//app-root//app-quickweeklytimesheet//div//div//div[1]//div//div//div//div[3]//table//tbody["+i+"]//tr//td[6]//span//select"));
 		Select slc = new Select(elm);
 		slc.selectByVisibleText(value);
 	}
 	private void EnterHours(int i, String value){
 		 WebElement elm = driver.findElement(By.xpath("//html//body//app-root//app-quickweeklytimesheet//div//div//div[1]//div//div//div//div[3]//table//tbody["+i+"]//tr//td[7]//span//input"));
 		 elm.click();
 		 elm.sendKeys(value);
 	}
 	
 	private void EnterRemarks(int i, String value){
 		 WebElement elm = driver.findElement(By.xpath("//html//body//app-root//app-quickweeklytimesheet//div//div//div[1]//div//div//div//div[3]//table//tbody["+i+"]//tr//td[8]//span//textarea"));
 		 elm.click();
 		 elm.sendKeys(value);
   }
 	
	public void Logout() throws InterruptedException {
		Thread.sleep(1000);
		cmnu.ClickByXpath(By.xpath("//div[@class='navbar-collapse']//ul[2]//li[2]//a//i"));
		driver.findElement(By.xpath("//a[contains(text(),'  Logout')]")).click();
		driver.quit();		
	}
	   
}


