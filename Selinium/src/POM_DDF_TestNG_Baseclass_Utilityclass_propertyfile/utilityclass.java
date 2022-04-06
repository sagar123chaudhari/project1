package POM_DDF_TestNG_Baseclass_Utilityclass_propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass
{
	// this method is use to get testdata from excel sheet
	// need to pass 2 parameters : 1=rowIndex , 2=colIndex
	//author name = sanjay
	
	public static  String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Selinium\\testdata\\excelsheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
		 
	}
	
	public static void capturescreenshot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Hp\\eclipse-workspace\\Selinium\\screenshots\\testcase"+TCID+".jpg");
        FileHandler.copy(src, dest);
		
	}
	
	
	
	
	

}
