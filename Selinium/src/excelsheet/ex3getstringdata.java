package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3getstringdata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Workbook book =WorkbookFactory.create(file);
		
		Sheet sh=book.getSheet("sagar");
		
		Row rw=sh.getRow(0);
		
		Cell cl=rw.getCell(2);
		
		String value =cl.getStringCellValue();
		
		System.out.println(value);
		
		
	}
}
