package POM_DDF_TestNG_Baseclass_Utilityclass_propertyfile;

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

import POM_DDF_TestNG_Base_Utulityclass_failedTC_screenshot.utilityclass;

public class kitelogintest extends baseclass 
{
	log1page log1;
	log2page log2;
	loghomepage home;


	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		initializeBrowser();
		
		    
			
			log1 = new log1page(driver);
		    log2 = new log2page(driver);
			home = new loghomepage(driver);
			
			
	}
	
	

	@BeforeMethod
	public void logintoApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		log1.inputklog1user(utilityclass.getTD(0, 0));
		log1.inputklog1pwd(utilityclass.getTD(0, 1));
		log1.clickklog1login();
		Thread.sleep(3000);
		log2.inputklog2pin(utilityclass.getTD(0, 2));
		log2.clickklog2contbtn();
	}
	
	
	@Test
	public void verifyuserID() throws EncryptedDocumentException, IOException
	{
		String actid =home.getloghomepage();
		String expid = utilityclass.getTD(0, 3);
		Assert.assertEquals(actid, expid, "failed both result");
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
