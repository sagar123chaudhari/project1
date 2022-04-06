package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex12_multibrowserTesting 
{
	
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException
	{
		WebDriver driver = null;
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Desktop\\selenium new\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browsername.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver","");
		    driver = new OperaDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(4000);
		
		driver.quit();
			
			
			
			
	}

}
