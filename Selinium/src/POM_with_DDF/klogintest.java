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

public class klogintest 
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
		
		klogin1page log1 = new klogin1page(driver);
		String use = sh.getRow(0).getCell(0).getStringCellValue();
		log1.entUN(use);
		String pd = sh.getRow(0).getCell(1).getStringCellValue();
		log1.entPW(pd);
		
		log1.clickLN();
		
		Thread.sleep(3000);
		
		klogin2page log2 = new klogin2page(driver);
		String pn = sh.getRow(0).getCell(2).getStringCellValue();
		log2.entPIN(pn);
		log2.clickCON();
		
		Thread.sleep(3000);
		
		kloginhomepage home = new kloginhomepage(driver);
		String unid = sh.getRow(0).getCell(1).getStringCellValue();
		home.getuser(unid);
		
		
		
		
		
		
	}

}
