package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable1 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		boolean but = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(but);
		
		if(but==true)
		{
			System.out.println("login is enable");
		}
		else
		{
			System.out.println("login is disable");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
