package handlingautosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("samsung");
		
		Thread.sleep(5000);
		
		String expectedtext = "samsung s22 ultra";
		
		List<WebElement> allopt = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		
		for(WebElement s1 :allopt)
		{
			String actualtext = s1.getText();
			System.out.println();
			if(actualtext.equals(expectedtext))
			{
				s1.click();
				break;
			}
			
			
			
		}
		
	}
}	
	


