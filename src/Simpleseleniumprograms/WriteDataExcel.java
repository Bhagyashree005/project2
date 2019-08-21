package Simpleseleniumprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class WriteDataExcel {
	
	public static void readData() throws IOException,EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\sheet.xlsx" );
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh  =wbook.getSheet("Sheet1");
		//sh.createRow(2).createCell(0).setCellValue("Student Name");
		Row row =sh.createRow(2);
		row.createCell(0).setCellValue("Student name");
		row.createCell(1).setCellValue("ID");
		row.createCell(3).setCellValue("LoginTime");
		
		FileOutputStream fio = new FileOutputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\sheet.xlsx");
		wbook.write(fio);
		fio.flush();
		fio.close();
		fis.close();
		wbook.close(); // closing sourcefile or connections 
		
		
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		readData();

	}

}
