package handlingautosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		String exp ="apple watch";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
		
		Thread.sleep(3000);
		
		List<WebElement> allop = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s1:allop)
		{
			String act = s1.getText();
			
			if(act.equals(exp))
			{
				s1.click();
				break;
			}
		}
		
		
		
		
		
	}

}
