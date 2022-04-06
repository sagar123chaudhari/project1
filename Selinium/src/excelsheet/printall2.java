package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printall2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\selenium new\\excelsheet.xlsx");
		
		Sheet nk = WorkbookFactory.create(file).getSheet("sagar");
		int lastrowindex = nk.getLastRowNum();	
		System.out.println(lastrowindex);
		System.out.println("----------");
	int lastcellindex = nk.getRow(0).getLastCellNum();
		System.out.println(lastcellindex);
		System.out.println("----------");
		
		
		for(int i= 0; i<=lastrowindex;i++) // for row
		{
			for(int j=0;j<=lastcellindex-1;j++) // for clmn
			{
				String bb = nk.getRow(i).getCell(j).getStringCellValue();
				System.out.print(bb+"  ");
			}
			System.out.println();
			
		}
}

}
