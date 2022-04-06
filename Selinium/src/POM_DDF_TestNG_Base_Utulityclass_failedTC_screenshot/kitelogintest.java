package POM_DDF_TestNG_Base_Utulityclass_failedTC_screenshot;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class kitelogintest extends baseclass 
{
	log1page log1;
	log2page log2;
	loghomepage home;
	int TCID;
	
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
		log1.inputklog1user(utilityclass.getPFData("UN"));
		log1.inputklog1pwd(utilityclass.getPFData("PWD"));
		log1.clickklog1login();
		Thread.sleep(3000);
		log2.inputklog2pin(utilityclass.getPFData("PIN"));
		log2.clickklog2contbtn();
	}
	
	
	@Test
	public void verifyuserID() throws EncryptedDocumentException, IOException
	{
		TCID = 101;
		String actid =home.getloghomepage();
		String expid = utilityclass.getTD(0, 3);
		Assert.assertEquals(actid, expid, "failed both result");
	//	home.getuserklogid(sh.getRow(0).getCell(3).getStringCellValue());
		
	}
	
	@AfterMethod
	public void logoufromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==TestResult.FAILURE)
		{
			utilityclass.capturescreenshot(driver, TCID);
		}
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
