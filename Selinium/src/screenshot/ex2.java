package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		File sors=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(sors);
		
		File dest = new File("C:\\Users\\Hp\\Desktop\\selenium new\\screenshot\\sag1.jpg");
		
		FileHandler.copy(sors, dest);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
