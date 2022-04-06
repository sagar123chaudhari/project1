package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidendivision2
{
	 public static void main(String[] args) throws InterruptedException
	    {
	    	
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
			
	    	WebDriver driver = new ChromeDriver();
	    	
	    	driver.get("https://www.amazon.in/");
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
	    	

}
}