package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.co.in/");
	
	   String title = driver.getTitle();
	   
	   System.out.println(title);
	   
	   String url = driver.getCurrentUrl();
	
	    System.out.println(url);
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	
	}
}
