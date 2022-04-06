package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logtest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			log1page log1 = new log1page(driver);
			String use = sh.getRow(0).getCell(0).getStringCellValue();
			log1.inputklog1user(use);
			String pw = sh.getRow(0).getCell(1).getStringCellValue();
			log1.inputklog1pwd(pw);
			log1.clickklog1login();
			
			Thread.sleep(3000);
			
			log2page log2 = new log2page(driver);
			String pin = sh.getRow(0).getCell(2).getStringCellValue();
			log2.inputklog2pin(pin);
			log2.clickklog2contbtn();
			
			Thread.sleep(3000);
			
			loghomepage home = new loghomepage(driver);
			String get = sh.getRow(0).getCell(3).getStringCellValue();
			home.getuserklogid(get);
			
			Thread.sleep(5000);
			driver.close();
		
	}
}
