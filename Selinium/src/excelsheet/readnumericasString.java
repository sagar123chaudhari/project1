package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readnumericasString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
	Workbook s= WorkbookFactory.create(f);
		Sheet r=s.getSheet("rohan");
		Row k =r.getRow(4);
		Cell t=k.getCell(1);
		String result = t.getStringCellValue();
		System.out.println(result);
		
	}

}
