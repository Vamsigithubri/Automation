package DataDrivenTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonCode.Common;
import DataDrivenCore.TestCore;
import DataDrivenPom.ViewTimeSheet;
import DataDrivenUtilities.CommonUtil;

public class ViewTimeSheetTest extends TestCore{
	
	ViewTimeSheet vt = new ViewTimeSheet();
	
	@Test(priority=1)
	public void VerifyViewTimeSheetTitles() throws InterruptedException {
		
		vt.ViewTimeSheetTitles();
	}
	@Test(priority=2)
	public void VerifyViewTimeTable() throws Exception {
		
		vt.ViewTimeTable();
	}
	}


