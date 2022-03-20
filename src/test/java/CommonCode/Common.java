package CommonCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataDrivenCore.TestCore;

public class Common extends TestCore {
	//WebDriver driver= null;
	public void waitAndClick(By elm)	
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(elm));
		driver.findElement(elm).click();		
	}
	public void Click(By elm)	
	{
	
		driver.findElement(elm).click();		
	}
	public void waitAndEnterText(By elm, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elm));
		wait.until(ExpectedConditions.elementToBeClickable(elm));
		driver.findElement(elm).clear();
		driver.findElement(elm).sendKeys(value);	
	}
	public void EnterText(By elm, String value)
	{
		driver.findElement(elm).clear();
		driver.findElement(elm).sendKeys(value);	
	}
	public String GetText(By elm)
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elm));
		return driver.findElement(elm).getText();
	}
	
	public void waitUntilLoading()
	{
	    By elm = By.xpath("//*[@class='circular']");	
		WebDriverWait wait = new WebDriverWait(driver,480);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elm));
	}
	
	 public void SelectProject(int i, int j , String value) {
   		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr["+j+"]//td[2]//span//select"));
   		Select slc = new Select(elm);
   		slc.selectByVisibleText(value);
   	}
   	
   	public void SelectTask(int i, int j , String value) {
   		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr["+j+"]//td[3]//span//select"));
   		Select slc = new Select(elm);
   		slc.selectByVisibleText(value);
   	}
   	
   	public void SelectSubTask(int i, int j , String value) {
   		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr["+j+"]//td[4]//span//select"));
   		Select slc = new Select(elm);
   		slc.selectByVisibleText(value);
   	}
   	public void EnterHours(int i, int j , String value){
   		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr["+j+"]//td[5]//span//input"));
   		 elm.click();
   		 elm.sendKeys(value);
   	}
   	
   	public void EnterRemarks(int i, int j , String value){
   		 WebElement elm = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody["+i+"]//tr["+j+"]//td[6]//span//textarea"));
   		 elm.click();
   		 elm.sendKeys(value);
   	}
	

}
