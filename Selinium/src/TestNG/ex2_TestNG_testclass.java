package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex2_TestNG_testclass 
{   
	
	@Test
	public void openbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(3000);
	
	driver.close();
	
	}

}
