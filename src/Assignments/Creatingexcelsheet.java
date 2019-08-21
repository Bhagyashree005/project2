package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Creatingexcelsheet {

	public static void WriteData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\sheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.createRow(2);
		for(int i =0;i<=10;i++) {
			r.createCell(i).setCellValue("HAppy new year");
		}
		System.out.println("writing the value");
		//Row r = null;
		if(sh!=null)
		{
			r = sh.getRow(2);
			Cell c = r.getCell(3);
		}
		//System.out.println(c);
		
		FileOutputStream fio = new FileOutputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\sheet.xlsx");
		wb.write(fio);
		fio.flush();
		fio.close();
		fis.close();
		wb.close(); // closing sourcefile or connections 
		
		
	}
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	WriteData();	

	}

}
