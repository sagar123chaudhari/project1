package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyandprintdata1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");

		Cell s1 = sh.getRow(0).getCell(0);
		
		CellType a1 = s1.getCellType();
		
		if(a1==CellType.STRING)
		{
			String v = s1.getStringCellValue();
			System.out.println(v);
		}
		
		
	}
}
