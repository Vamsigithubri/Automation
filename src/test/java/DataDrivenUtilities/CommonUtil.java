package DataDrivenUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataDrivenCore.TestCore;

public class CommonUtil extends TestCore {
	
     WebDriverWait wait ; 
	
	public void ClickByXpath(By path)
	{
		try
		{
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(path));
		driver.findElement(path).click();
		System.out.println("Click on the Locator Successfully !!");
		
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			System.out.println("Element is -NOT- Click !!");
		}
	}
	
	public void waitUntilElementISVisible(By locator)
	{
		
	}
	
	public String waitAndGetText(By locator)
	{
		try
		{
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String text = driver.findElement(locator).getText();
		System.out.println("Get this Text : "+text+ " Successfully !!");
		return text;
		
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			System.out.println("Element is -NOT- Visible !!");
		}
		return null;
	}
	
}
