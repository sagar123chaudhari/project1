package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kitelogintest 
{
	log1page log1;
	log2page log2;
	loghomepage home;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
			
			log1 = new log1page(driver);
		    log2 = new log2page(driver);
			home = new loghomepage(driver);
			
			
	}
	
	
	
	@BeforeMethod
	public void logintoApp() throws InterruptedException
	{
		log1.inputklog1user(sh.getRow(0).getCell(0).getStringCellValue());
		log1.inputklog1pwd(sh.getRow(0).getCell(1).getStringCellValue());
		log1.clickklog1login();
		Thread.sleep(2000);
		log2.inputklog2pin(sh.getRow(0).getCell(2).getStringCellValue());
		log2.clickklog2contbtn();
	}
	
	
	@Test
	public void verifyuserID()
	{
		String actid =home.getloghomepage();
		String expid = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actid, expid);
	//	home.getuserklogid(sh.getRow(0).getCell(3).getStringCellValue());
		
	}
	
	@AfterMethod
	public void logoufromApp()
	{
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
