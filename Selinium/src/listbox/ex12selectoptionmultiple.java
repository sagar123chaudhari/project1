package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex12selectoptionmultiple
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.htmlelements.com/demos/listbox/selection-multi-extended/");
		
		Thread.sleep(2000);
		
		WebElement multiple=driver.findElement(By.xpath("//a[@class='ripple current']"));
		
		Select s = new Select(multiple);
		
		s.selectByVisibleText("Angel");
		s.selectByVisibleText("Peter");
		s.selectByVisibleText("Bayko");
		
		
		
		
		
		
		
		
		
	}

}
