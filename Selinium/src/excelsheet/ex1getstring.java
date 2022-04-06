package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1getstring 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
	Workbook bk=WorkbookFactory.create(file);
		
	Sheet ro=bk.getSheet("rohan");	
	
	Row co=ro.getRow(5);
		
	Cell p =co.getCell(4);	
		
	String value =p.getStringCellValue();
	System.out.println(value);	
		
		
		
		
	}

}
