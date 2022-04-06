package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printall 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet nk = WorkbookFactory.create(file).getSheet("sagar");
		
		for(int i= 0; i<=3;i++) // for row
		{
			for(int j=0;j<=3;j++) // for clmn
			{
				String bb = nk.getRow(i).getCell(j).getStringCellValue();
				System.out.print(bb+"  ");
			}
			System.out.println();
			
		}
}
}