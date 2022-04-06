package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
	//	ChromeDriver driver = new ChromeDriver();
		
	//	driver.get("https://chromedriver.chromium.org/downloads");
		
		WebDriver driver = new ChromeDriver(); 
		
	//	WebDriver drive = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	//	driver.get("https://www.flipkart.com");
		
	//	Thread.sleep(5000);
		
	//	driver.close();
		
		
		
		
	}

}
