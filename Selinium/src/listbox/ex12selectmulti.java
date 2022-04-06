package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex12selectmulti 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("file:///C:/Users/Hp/Desktop/selenium%20new/html_files/mov.html");
	
	Thread.sleep(2000);
	
	WebElement multiple=driver.findElement(By.xpath("//select[@id='123']"));
	
	Select s = new Select(multiple);
	
	s.selectByVisibleText("bollywood");
	s.selectByVisibleText("kollywood");
	
	
	
	
	

}
}