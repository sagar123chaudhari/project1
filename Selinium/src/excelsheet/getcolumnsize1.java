package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcolumnsize1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		int cellsize = WorkbookFactory.create(f).getSheet("sagar").getRow(0).getLastCellNum();
		
		System.out.println(cellsize);
		
		
		
		
	}

}
