package customiselistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3homekey
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=6; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		

}
}