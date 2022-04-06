package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_without_DDF 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("THM944");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bisen@7566");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("812073");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	String actualid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String expid = "THM994";
	
	if(actualid.equals(expid))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
//	Thread.sleep(4000);
//	driver.close();
	
	
	
	
		
		
		
}
}