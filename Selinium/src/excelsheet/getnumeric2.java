package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getnumeric2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream f = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		double v1 = WorkbookFactory.create(f).getSheet("rohan").getRow(004).getCell(01).getNumericCellValue();
		System.out.println(v1);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
