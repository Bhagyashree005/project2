package TestNGprograms;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.entity.InputStreamFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class WriteinExcelsheet {
	
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	List<WebElement> itemlist;
	Row row;
	Workbook wbook;
	Sheet sh;
	FileInputStream fis;
	
	//WebDriver driver;
  @Test
  public void writeinExcel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://urbanladder.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//li[@class='topnav_item livingunit']")).click();;
	Thread.sleep(1000);
	  List<WebElement> itemlist = driver.findElements(By.xpath("//li[@class='topnav_item livingunit']/div/descendant:: span"));
	  
	  
	//To print in Excelsheet  
        FileInputStream fis = new FileInputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\Sheet.xlsx" );
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh  =wbook.getSheet("Sheet1");
		Row row = sh.createRow(0);
		Cell cell =row.createCell(0);
		
		int j=0;
		
		for(int i=0;i<itemlist.size();i++)
		
	      {

			  String text =  itemlist.get(i).getText();
		      System.out.println(text);
		      sh.createRow(j).createCell(0).setCellValue(text);
	          j++;
	      }
	   
		
		FileOutputStream fio = new FileOutputStream("C:\\Users\\Bhagyashree\\Desktop\\Java\\Sheet.xlsx");
		wbook.write(fio);
		fio.flush();
		fio.close();
		fis.close();
		wbook.close(); 
		
  }
  
//  @Test(priority=2)
//  public void fetchdata()
//  {
//	  for(int i=0;i<itemlist.size();i++)
//      {
//		for(int j=0;j<=i;j++)
//		{
//		String text =  itemlist.get(i).getText();
//	      System.out.println(text);
//		  row.createCell(j).setCellValue(text);
//		}
//	}
	  
	  
  }
  


