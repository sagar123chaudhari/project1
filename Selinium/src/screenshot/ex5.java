package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex5 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/samantharuthprabhuoffl/?hl=en");
		
		Thread.sleep(3000);
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d = new File("C:\\Users\\Hp\\Desktop\\selenium new\\screenshot\\d.jpg");
		
		FileHandler.copy(s, d);
		
		
		
		
		
		
		
		
		
	}
}
