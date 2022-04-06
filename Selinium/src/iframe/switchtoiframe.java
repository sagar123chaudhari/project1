package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoiframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	//	driver.switchTo().frame("iframeResult");
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		
		// action on iframe
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	//	Thread.sleep(2000);
		
		//switch to main page
	//	driver.switchTo().parentFrame();
		
		//action for main page
	//	driver.findElement(By.xpath(null))
		

}
}