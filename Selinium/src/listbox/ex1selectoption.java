package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1selectoption
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		//step 1: identify listbox which need to be handled
		//        and store it in a reference variable
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		//step 2: create an object of select class
		//        which accept webelement argument
		
		Select s = new Select(month);
		
		//step 3: use select class methods to select option
		
		//s.selectByValue("6");            // String input
		//s.selectByVisibleText("Dec");    // String input
		s.selectByIndex(0);                
		
		
		
	}

}
