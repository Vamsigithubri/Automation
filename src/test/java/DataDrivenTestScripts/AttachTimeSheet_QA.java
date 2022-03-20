package DataDrivenTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenTestData.TestData;
import DataDrivenUtilities.CommonUtil;

public class AttachTimeSheet_QA extends TestCore {
	CommonUtil cmnu = new CommonUtil();
	public By ClickHere = By.xpath("//strong[contains(text(),' Click Here  ')]");
	public By username_QA = By.xpath("//input[@name='email']");
	public By password_QA = By.xpath("//input[@name='password']");
	public By loginButton_QA = By.xpath("//button[contains(text(),'login')]");
	Common cmn= new Common();
	
	@Test
	public void AttachTimesheet() throws InterruptedException    {
		Thread.sleep(1000);
		cmnu.ClickByXpath(By.xpath("//span[contains(text(),'HomePage')]"));
		Thread.sleep(1000);
		cmnu.ClickByXpath(By.xpath("//a[@class='nav-link dropdown-toggle text-muted waves-effect waves-dark m-t-5']"));
		Thread.sleep(1000);
		cmnu.ClickByXpath(By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]"));
		Thread.sleep(1000); 
	     cmn.Click(By.xpath("//a[@class='has-arrow']"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Attach Time')]")).click();
		String ActualText = driver.findElement(By.id("UploadTimesheetAttachDataVt")).getText();
		System.out.println(ActualText);
		String ExpectedText = "Upload Time Sheet Attach Document";
		
		Thread.sleep(1000);
		List<WebElement>  elm = driver.findElements(By.xpath("//table[@class='table toggle-circle table-hover default no-paging footable-loaded footable']//thead//tr//th"));
		String Columns = elm.get(0).getText();
		String ExColumn = "Associate";
		System.out.println(Columns);
		//Assert.assertEquals(Columns, ExColumn);
		int len = elm.size();
		System.out.println(len);
		for(int i=0; i<len; i++)
		{
			String ar[] = new String[len];
			ar[i] = elm.get(i).getText();
			String ar2[] = {"Associate","Project/WO","From Date","To Date","Document Link"};
			if(ar[i].equalsIgnoreCase(ar2[i]))
			{
				System.out.println("Columns name i Equal");
				System.out.println("Expected Column: "+ ar2[i]+ " and Actual Colunm: " + ar[i]);
			}
			
			else
			{
				System.out.println("Columns name is NOT Equal");
				System.out.println("Expected Column: "+ ar2[i]+ " and Actual Column: " + ar[i]);
					
		}
			
	}
		}
	@AfterTest(enabled=true)
	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='navbar-collapse']//ul[2]//li[2]//a//i")).click();
		driver.findElement(By.xpath("//a[contains(text(),'  Logout')]")).click();
		driver.quit();		
	}	
}


