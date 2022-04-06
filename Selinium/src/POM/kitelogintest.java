package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogintest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		kitelogin1page login1 = new kitelogin1page(driver);
		login1.enterun();
		login1.enterpw();
		login1.clicklogin();
		
		Thread.sleep(3000);
		
		kitelogin2page login2 = new kitelogin2page(driver);
		login2.enterpin();
		login2.clickconti();
		
		Thread.sleep(3000);
		
		kitehomepage home = new kitehomepage(driver);
		home.verifyuserid();
		
	
}

}
