package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable2 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
	
		boolean a = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']")).isEnabled();
	System.out.println(a);
	
	if(a==true)
	{
		System.out.println("is enable");
	}
	else
	{
		System.out.println("is disable");
	}
	
	
	
	
	}
}
