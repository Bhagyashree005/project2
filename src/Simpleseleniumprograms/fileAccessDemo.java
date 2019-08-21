package Simpleseleniumprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileAccessDemo {
public static void readData() throws IOException,EncryptedDocumentException, InvalidFormatException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Bhagyashree\\eclipse-workspace\\Selenium\\Excelsheet\\July 2019_Sonim_Timesheet_Day01-to-Day07thJULY.xls" );
	Workbook wbook = WorkbookFactory.create(fis);
	Sheet sh  =wbook.getSheet("Sheet1");
	for(int i=0;i<sh.getPhysicalNumberOfRows();i++)
	{
		for(int j=0;j<sh.getRow(i).getPhysicalNumberOfCells();j++)
		{
			System.out.println(sh.getRow(i).getCell(j).getStringCellValue()+" ");
		}
		System.out.println();
	}
	
//	Row row = sh.getRow(0);
//	Row row1 =sh.getRow(2);
//	
//	Cell cell = row.getCell(0); // Row, Cell, sheet are interfaces 
//	Cell cell1 = row1.getCell(0);
//	
//	System.out.println(cell.getStringCellValue());
//	System.out.println(cell1.getStringCellValue());
//	//System.out.println();
	wbook.close();

}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		readData();
		
		
		
	}
				

	}


