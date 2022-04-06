package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readnumericasString2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fl = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		String v = WorkbookFactory.create(fl).getSheet("sagar").getRow(3).getCell(0).getStringCellValue();		
		
		System.out.println(v);
		
		
	}

}
