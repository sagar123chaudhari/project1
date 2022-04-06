package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@class,'_6lti ')]")).click();
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mnbvcxz");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yhj");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("5456666");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("5456666");
	//.findElement(By.xpath("")).click();
		
		
		
		
	
	
	
	
	}
}
