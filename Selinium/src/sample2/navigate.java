package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Snowdrop_(South_Korean_TV_series)");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.co.in/");
	
		Thread.sleep(3000);
	
	
    	driver.navigate().back();
    	
    	Thread.sleep(3000);
	
	     driver.navigate().refresh();
	     
	     Thread.sleep(3000);
	     
	     
	     driver.navigate().forward();
	     
	     Thread.sleep(3000);
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(3000);
	
	     driver.manage().window().minimize();
	     
	     
	     
//	=driver.manage();
//	driver.
	
	
	}

}
