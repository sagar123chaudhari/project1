package handlingautosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 
{
	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		String expt ="oneplus nord 2";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
		Thread.sleep(3000);
		
		List<WebElement> allopt = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		
		for(WebElement s1:allopt)
		{
			String actu = s1.getText();
			
			if(actu.equals(expt))
			{
				s1.click();
			}
		}
		
	}

}
