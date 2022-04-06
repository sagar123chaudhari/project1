package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributes
{
    public static void main(String[] args)
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/");
    	
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagar");
    	
 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sindhu");
    	
    	driver.findElement(By.xpath("//button[@name='login']")).click();
 

 
	}

}
