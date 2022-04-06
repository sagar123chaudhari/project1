package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_handlingofdropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement lang = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(lang).perform();
		
		
		
		
	}

}
