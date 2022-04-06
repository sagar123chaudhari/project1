package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow1 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on newtab from mainpage
	   	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	   	
	   	//for switch on child window
	   	//first we get childwindows ID/adress
	   	Set<String> childadd = driver.getWindowHandles();  //----- this method give 2 ID
	   	                                                     //    1.mainpageID and 2.childwindowID
		ArrayList<String> al = new ArrayList<String>(childadd);
		String mainpageID = al.get(0);
		String childwindowID = al.get(1);
		
	   	
	   	// to click training link first we switch on childwindow
	   	driver.switchTo().window(childwindowID);
	   	
		//click on training link
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(mainpageID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
	}
	

}
