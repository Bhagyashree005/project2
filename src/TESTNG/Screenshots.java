package TESTNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {
	static {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe" );
		}
	
	WebDriver driver;
  @Test (priority=2)// to capture only small screenshot
  public void f() throws IOException {
	  driver = new ChromeDriver();
	  driver.get("https://demo.actitime.com");
	  driver.manage().window().maximize();
	  File source = driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
	  File destination = new File("C:\\Users\\Bhagyashree\\Desktop\\Java\\pic.png");
	  
      FileUtils.copyFile(source, destination);

  }
  
  @Test  (priority=1)// to capture screenshots in bluestones 
  public void bluestonesmap() throws IOException, InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.bluestone.com/store.html");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();;
	  //.getScreenshotAs(OutputType.FILE);
	  List<WebElement> ele = driver.findElements(By.xpath("//div[@class='map-image']"));
	  int a=1;
	  for(WebElement store : ele)
	  {
		  File source = driver.findElement(By.xpath("//div[@class='map-image']")).getScreenshotAs(OutputType.FILE);
		  String str = "mapscreenshot";
		  File destination = new File("C:\\Users\\Bhagyashree\\Desktop\\Screenshot\\"+str+a+".png");
		  FileUtils.copyFile(source, destination);
		  a++;
	  }
	    

}
