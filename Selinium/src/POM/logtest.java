package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logtest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			log1page log1 = new log1page(driver);
			log1.inputklog1user();
			log1.inputklog1pwd();
			log1.clickklog1login();
			
			Thread.sleep(3000);
			
			log2page log2 = new log2page(driver);
			log2.inputklog2pin();
			log2.clickklog2contbtn();
			
			Thread.sleep(3000);
			
			loghomepage home = new loghomepage(driver);
			home.getuserklogid();
			
			Thread.sleep(5000);
			driver.close();
		
	}
}
