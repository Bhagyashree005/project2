package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeusingCustomele {

	static {
		      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) {
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("file:///C:/Users/Bhagyashree/Desktop/Java/Demo2.html");
  WebElement val = driver.findElement(By.id("t1"));
		val.sendKeys("TEST YANTRA");
 
   WebDriverWait wait = new WebDriverWait(driver,10);
   wait.until(new ExpectedCondition<Boolean>() {
	   
	  @Override
	  
		  public Boolean apply(WebDriver d) {
			  if(val.equals("TEST YANTRA"))  
		    return  true;
			 // driver.findElement(By.id("s1")).sendKeys("TYSS");
			  else 
			  {
				  return false;
			  }
	  }
	  
   });
	driver.findElement(By.id("s1")).sendKeys("TYSS");
	}


}

 
//while(true)
//{
//	try
//	{
//		driver.findElement(By.id("t1")).sendKeys("TEST YANTRA");
//		//System.out.println("");
//		driver.findElement(By.id("s1")).sendKeys("TYSS");
//		break;
//	}
//
//catch(Exception e)
//	{
//		System.out.println("exception caught");
//	}
//
//	}

	

