package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributes4
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.stealmylogin.com/demo.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ssddffff");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ssd");
		
		driver.findElement(By.xpath("//input[@value='login']")).click();
		
		
		
	
		
		
		
		
	}

}
