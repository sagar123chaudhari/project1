package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("rock");
		
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		alt.accept();
		alt.accept();

		
	}
}
