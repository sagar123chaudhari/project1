package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyandprintdata2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");

		Cell cellinfo = sh.getRow(1).getCell(2);
		 CellType type = cellinfo.getCellType();
		
		 if (type == CellType.STRING)
		 {
			 String value = cellinfo.getStringCellValue();
			 System.out.println(value);
		 }
		 
		 else if(type== CellType.NUMERIC)
		 {
			 double value = cellinfo.getNumericCellValue();
			 System.out.println(value);
			 
		 }
	}
}
