package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
	//	ChromeDriver D = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.close();
		
		
		
	}

}
