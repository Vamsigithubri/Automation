package DataDrivenPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenUtilities.CommonUtil;

public class ViewTimeSheet {
	
	Common cmn = Common();
	CommonUtil cmnu = new CommonUtil();
	WebDriver driver ;
	public By ClickHere = By.xpath("//strong[contains(text(),' Click Here  ')]");
	public By loginButton_QA = By.xpath("//button[contains(text(),'login')]");
	
	public void ViewTimeSheetTitles() throws InterruptedException {
	Thread.sleep(1000);
	cmnu.ClickByXpath(By.xpath("//span[contains(text(),'HomePage')]"));
	Thread.sleep(1000);
	cmnu.ClickByXpath(By.xpath("//a[@class='nav-link dropdown-toggle text-muted waves-effect waves-dark m-t-5']"));
	Thread.sleep(1000);
	cmnu.ClickByXpath(By.xpath("//div[@class='dropdown-menu']//div//div//div//div//div[4]"));
    //String ActualText = driver.findElement(By.xpath("//a[@title='Modules']")).getText();
   	//System.out.println(ActualText);
	//String ExpectedText = "Modules";

   	Thread.sleep(1000);
   	//cmnu.ClickByXpath(By.xpath("//a[@href='#/module/time']"));
    //String ActualText1 = driver.findElement(By.xpath("//a[@href='#/module/time']")).getText();
   	//System.out.println(ActualText1);
   	//String ExpectedText1 = " time ";
   	
   	Thread.sleep(1000);
   	String ActualText2 = driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).getText();
   	System.out.println(ActualText2);
   	String ExpectedText2 = "Filters";
    Assert.assertEquals(ActualText2, ExpectedText2);
	 
	 String ActualText3 = driver.findElement(By.xpath("//span[contains(text(),'Facets')]")).getText();
	 System.out.println(ActualText3);
	 String ExpectedText3 = "Facets";
     Assert.assertEquals(ActualText3, ExpectedText3);
     
     String ActualText4 = driver.findElement(By.xpath("//label[contains(text(),'View')]")).getText();
	 System.out.println(ActualText4);
	 String ExpectedText4 = "View";
     Assert.assertEquals(ActualText4, ExpectedText4);
     
     String ActualText5 = driver.findElement(By.xpath("//label[contains(text(),'Project Manager')]")).getText();
	 System.out.println(ActualText5);
	 String ExpectedText5 = "Project Manager";
     Assert.assertEquals(ActualText5, ExpectedText5);
     
     String ActualText6 = driver.findElement(By.xpath("//label[contains(text(),'Project/WO')]")).getText();
	 System.out.println(ActualText6);
	 String ExpectedText6 = "Project/WO";
     Assert.assertEquals(ActualText6, ExpectedText6);
     
     String ActualText7 = driver.findElement(By.xpath("//label[contains(text(),'Customer')]")).getText();
	 System.out.println(ActualText7);
	 String ExpectedText7 = "Customer";
     Assert.assertEquals(ActualText7, ExpectedText7);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[contains(text(),'Show More')]")).click();
     String ActualText12 = driver.findElement(By.xpath("//a[contains(text(),'Show More')]")).getText();
	 System.out.println(ActualText12);
	 String ExpectedText12 = "Show More";
    
     
     String ActualText8 = driver.findElement(By.xpath("//label[contains(text(),'From Date')]")).getText();
	 System.out.println(ActualText8);
	 String ExpectedText8 = "From Date";
     Assert.assertEquals(ActualText8, ExpectedText8);
     
     String ActualText9 = driver.findElement(By.xpath("//label[contains(text(),'To Date')]")).getText();
	 System.out.println(ActualText9);
	 String ExpectedText9 = "To Date";
     Assert.assertEquals(ActualText9, ExpectedText9);
     
     String ActualText10 = driver.findElement(By.xpath("//label[contains(text(),'Status')]")).getText();
	 System.out.println(ActualText10);
	 String ExpectedText10 = "Status";
     Assert.assertEquals(ActualText10, ExpectedText10);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[contains(text(),'Show Less')]")).click();
     String ActualText11 = driver.findElement(By.xpath("//a[contains(text(),'Show Less')]")).getText();
	 System.out.println(ActualText11);
	 String ExpectedText11 = "Show Less";

     String ActualText13 = driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).getText();
	 System.out.println(ActualText13);
	 String ExpectedText13 = "Reset";
     Assert.assertEquals(ActualText13, ExpectedText13);
     
     String ActualText14 = driver.findElement(By.xpath("//button[contains(text(),'Search')]")).getText();
	 System.out.println(ActualText14);
	 String ExpectedText14 = "Search";
     Assert.assertEquals(ActualText14, ExpectedText14);
     
	}
	private Common Common() {
		return null;
	}
	
	
	public void ViewTimeTable() throws Exception {
		
		Thread.sleep(1000);
		List<WebElement>  elm = driver.findElements(By.xpath("//div[@class='table-responsive']//table//thead//tr//th"));
		String Columns = elm.get(0).getText();
		String ExColumn = "Associate";
		Assert.assertEquals(Columns, ExColumn);
		int len = elm.size();
		System.out.println(len);
		for(int i=0; i<len; i++)
		{
			String ar[] = new String[len];
			ar[i] = elm.get(i).getText();
			String ar2[] = {"Associate","Project","Activity","Sub Activity","Day","SubmittedHour","ApprovedHour","Status"};
			if(ar[i].equalsIgnoreCase(ar2[i]))
			{
				System.out.println("Columns name i Equal");
				System.out.println("Expected Column: "+ ar2[i]+ " and Actual Colunm: " + ar[i]);
			}
			
			else
			{
				System.out.println("Columns name is NOT Equal");
				System.out.println("Expected Column: "+ ar2[i]+ " and Actual Column: " + ar[i]);
				throw new Exception();
		}
		
		
		}
	
	
	}
	

	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='navbar-collapse']//ul[2]//li[2]//a//i")).click();
		driver.findElement(By.xpath("//a[contains(text(),'  Logout')]")).click();
		driver.quit();		
	}	

}
