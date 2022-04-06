package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyandprintrow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");

		int cellindex = sh.getRow(3).getLastCellNum()-1;
		
		for(int i=0;  i<=cellindex; i++)
		{
			Cell info = sh.getRow(3).getCell(i);
			CellType s1 = info.getCellType();
			
		if(s1==CellType.STRING)	
		{
			String v = info.getStringCellValue();
			System.out.print(v+" ");
		}
		else if(s1==CellType.NUMERIC)
		{
			double v = info.getNumericCellValue();
			System.out.print(v+" ");
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean v = info.getBooleanCellValue();
			System.out.print(v+" ");
		}
		}
		
		
	}
}
