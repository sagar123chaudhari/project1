package customiselistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex4homekey2
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Actions act = new Actions(driver);
		
		act.click(date).perform();
		Thread.sleep(2000);
		
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		for(int i=1; i<=6; i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
