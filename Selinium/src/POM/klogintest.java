package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class klogintest 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		klogin1page log1 = new klogin1page(driver);
		log1.entUN();
		log1.entPW();
		log1.clickLN();
		
		Thread.sleep(3000);
		
		klogin2page log2 = new klogin2page(driver);
		log2.entPIN();
		log2.clickCON();
		
		Thread.sleep(3000);
		
		kloginhomepage home = new kloginhomepage(driver);
		home.getuser();
		
		
		
		
		
		
	}

}
