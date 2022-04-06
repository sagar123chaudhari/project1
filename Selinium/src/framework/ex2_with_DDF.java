package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_with_DDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pin);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expid =sh.getRow(0).getCell(0).getStringCellValue(); 
		
		if(actualid.equals(expid))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		
		
		
	}

}
