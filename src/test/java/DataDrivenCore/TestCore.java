package DataDrivenCore;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestCore {
	
	public static WebDriver driver;
	//public static Properties object = new Properties();

	@BeforeSuite
	//@Parameters({"URL"})
	public static void setupdriver() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\11202485\\OneDrive - TECHWAVE\\Desktop\\Drivers\\chromedriver.exe"); 
		 Thread.sleep(1000);
		// WebDriverManager.chromedriver().setup();
		
		    //driver = new FirefoxDriver();
		  
		 driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://onewaveqa.techwave.net/#/quicklinks");
			
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\DataDrivenProperties\\Obj.Properties");
			 //object.load(fis);
	}
	
	
	
}
