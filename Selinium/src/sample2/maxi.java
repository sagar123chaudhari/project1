package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxi 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://en.wikipedia.org/wiki/Snowdrop_(South_Korean_TV_series)");
		
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
