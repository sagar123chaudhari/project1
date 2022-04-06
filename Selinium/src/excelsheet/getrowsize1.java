package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsize1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		int rowsize = WorkbookFactory.create(file).getSheet("rohan").getLastRowNum()+1;
		System.out.println(rowsize);
		
		
		
	}

}
