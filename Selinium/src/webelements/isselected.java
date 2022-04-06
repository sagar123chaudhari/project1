package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	
		Thread.sleep(3000);
		
		boolean fmbutton  = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		System.out.println(fmbutton);
		

		

		
		
		
		
		
		
		
		
		
	}
}
