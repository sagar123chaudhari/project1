package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcolumnsize2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fl = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		int cell = WorkbookFactory.create(fl).getSheet("rohan").getRow(5).getLastCellNum();
		System.out.println(cell);
		
		
		
		
		
	}

}
