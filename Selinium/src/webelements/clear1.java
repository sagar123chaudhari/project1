package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		WebElement u = driver.findElement(By.xpath("//input[@name='firstname']"));
		u.sendKeys("sagar");
		Thread.sleep(3000);
		u.clear();
		Thread.sleep(3000);
		u.sendKeys("rohan");
		
		
		
		
		
		
		
		
	}
}
