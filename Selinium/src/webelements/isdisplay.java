package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		
		boolean but = driver.findElement(By.xpath("//h1[text()='Instagram']")).isDisplayed();
		System.out.println(but);
		
		
		
		
		
		
	
		
	}
}
