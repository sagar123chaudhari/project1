package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//open webpage
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		//enter customerid
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("rock");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text from alert popup 
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//click on cancle btn from alert popup
	//	driver.switchTo().alert().dismiss();    // dismiss method use for click cancle btn
		
		//click on ok btn
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
	}

}
