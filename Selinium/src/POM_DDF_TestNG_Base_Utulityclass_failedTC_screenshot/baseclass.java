package POM_DDF_TestNG_Base_Utulityclass_failedTC_screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utilityclass.getPFData("URL"));
		
	}
	
	
		

}
