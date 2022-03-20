package DataDrivenTestScripts;

import java.lang.reflect.Array;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;

public class EnterTimeSheet1 extends TestCore{

	public By Left =By.xpath("//div[@class='page-wrapper']//div//div[1]//div//div/div//div[2]//div[1]//button[1]");
	public By Right = By.xpath("//i[@class='fa fa-chevron-right']");
	public By CopyTimeSheet = By.xpath("//button[contains(text(),'Copy Timesheet From previous Week')]");
	public By RowsCount = By.xpath("//div[@class='table-responsive'][1]//table//tbody");
	public By copyTable = By.xpath("//div[@class='table-responsive']//table//tbody[1]//tr//td[2]//label");
	public By RowsCountEnterTime = By.xpath("//table[contains(@class,'display')]//tbody");
	Common cmn = new Common();
	@Test
	public void CopyTimeSheet() throws InterruptedException
	{
		//Naviaget - Login Page 
		Thread.sleep(1000);
		cmn.Click(By.xpath("//span[contains(text(),'Enter Timesheet')]"));
		Thread.sleep(1000);
		//cmn.waitAndClick(Left);
		Thread.sleep(1000);
		int rowCount = driver.findElements(RowsCount).size();
		
		for (int i =1;i<=5;i++)
		{
			for(int j=4;j<=9;j++)
			{
				String[][] ar = new String[5][6];	
				ar[i-0][j-4]= driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr//td["+j+"]//label")).getText();
		System.out.println(ar[i-0][j-4]);
			}
		}
		//cmn.waitAndClick(Right);
		Thread.sleep(2000);
		cmn.Click(CopyTimeSheet);
		
		int rowCount1 = driver.findElements(RowsCountEnterTime).size();
		System.out.println(rowCount1);
		for(int k=0;k<rowCount1;k++)
		{
			String[] ar2 = new String[6];
			  ar2[k] = driver.findElement(By.xpath("//table[contains(@class,'display')]//tbody["+k+"]//tr//td[4]//span//select//option[2]")).getText();
			// ar2[k] = driver.findElement(By.xpath("//table[contains(@class,'display')]//tbody["+k+"]//tr//td[4]//span//select//option[]"))
			//table[contains(@class,'display')]//tbody[1]//tr//td[4]//span//select
		}
		
	      int rowCount2 = driver.findElements(RowsCountEnterTime).size();
		 for (int l=1;l<9;l++) {
			 
			 String[] ar3 = new String[6];
			// ar3[l] = driver.findElement(By.xpath("//table[contains(@class,'display')]//tbody["+l+"]//tr//td[5]//span//select//option[5]").getText();
		 }
	}
	
}
