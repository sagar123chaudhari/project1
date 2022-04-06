package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printalldatainrow1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet nk = WorkbookFactory.create(file).getSheet("sagar");
		
		
		int rowindex = nk.getLastRowNum();

		for(int i=0; i<=rowindex; i++)
		{
			String v = nk.getRow(0).getCell(i).getStringCellValue();
			System.out.print(v+" ");
		}
}
}