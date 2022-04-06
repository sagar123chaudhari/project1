package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex1
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(1000);
		
		//step1 
		
		File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(sourse);
		
		File dest = new File("C:\\Users\\Hp\\Desktop\\selenium new\\screenshot\\sagar1.jpg");
		
		FileHandler.copy(sourse, dest);
		
		
	}

}
